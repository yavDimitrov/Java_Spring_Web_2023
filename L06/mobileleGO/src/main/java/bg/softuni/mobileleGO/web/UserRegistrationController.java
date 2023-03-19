package bg.softuni.mobileleGO.web;

import bg.softuni.mobileleGO.model.dto.UserRegisterDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserRegistrationController {

    @GetMapping("/users/register")


    public String register() {
        return "auth-register";
    }

  @PostMapping
    public String register(UserRegisterDTO userRegisterDTO) {
        return "redirect:/";
  }

}
