
let insertEmployeeBtn = $("#insert-employee-btn");
insertEmployeeBtn.on('click', function () {

    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
   
    let usernameInput = $("#username-input").val();
    let passwordInput = $("#password-input").val();

    let employee = {
        "username": usernameInput,
        "password": passwordInput
    };

    //Ako non stop ulazi u error ukloni dataType
    //procitaj vise na https://stackoverflow.com/questions/46994832/jquery-ajax-always-executing-error
    $.ajax({
        method: 'POST',
        url: 'http://localhost:8080/register/saveUser',
        contentType: 'application/json',
        data: JSON.stringify(employee),
          beforeSend: function(xhr) {
             
            // here it is
            xhr.setRequestHeader(header, token);
             console.log(token);
        },
        success: function () {
            alert("success");
        },
        error: function () {
           alert("error");
        }
    });
    //  window.location.href = "http://localhost:8080/home";
});
