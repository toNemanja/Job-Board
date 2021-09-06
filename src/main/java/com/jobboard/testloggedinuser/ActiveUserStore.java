
package com.jobboard.testloggedinuser;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ActiveUserStore {

  public List<String>users;
  
  
  public ActiveUserStore(){
      users = new ArrayList<>();
  }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}
