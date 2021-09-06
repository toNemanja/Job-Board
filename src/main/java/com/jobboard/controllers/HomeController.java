package com.jobboard.controllers;

import com.jobboard.entity.Employer;
import com.jobboard.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    EmployerRepository empRepo;

    @GetMapping("/")
    public String displayHomePage() {
        return "home";
    }

    @GetMapping("/loginForm")
    public String displayLoginForm() {
        return "login-form-employee";
    }

    @GetMapping("/loginFormEmployer")
    public String displayLoginFormEmployer() {
        return "login-form-employer";
    }

    @PostMapping("/logedUserHomePage")
    public String logedUserHomePage(Model model) {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        //izdvoj u klasu
        if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            model.addAttribute("user", username);
        } else {
            String username = principal.toString();
        }
        return "loged-user-home";
    }

    @GetMapping("/registerUser")
    public String displayRegisterForm() {
        return "register-user";
    }

    @GetMapping("/registerEmployer")
    public String displayEmployerRegisterForm() {
        return "register-employer";
    }

    @GetMapping("/job-form")
    public String jobForm(Model model) {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        //izdvoj u klasu
        if (principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            Employer emp = empRepo.findByUsername(username);

            if (emp != null) {
                System.out.println("nije null " + emp.getId());
                model.addAttribute("id", emp.getId());
            } else {
                System.out.println("null je");
            }
        } else {
            String username = principal.toString();
        }
        return "job-form";
    }

}
