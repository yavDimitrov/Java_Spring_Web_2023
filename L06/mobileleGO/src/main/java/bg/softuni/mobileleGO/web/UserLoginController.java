package bg.softuni.mobileleGO.web;

import bg.softuni.mobileleGO.model.dto.UserLoginDTO;
import bg.softuni.mobileleGO.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserLoginController {

    private UserService userService;

    public UserLoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/login")
    public String login(){
        return "auth-login";
    }

    @GetMapping("/users/logout")
    public String logout(){
        userService.logout();
        return "redirect:/";
    }

    @PostMapping ("/users/login")
    public String login(UserLoginDTO userLoginDTO) {
        userService.login(userLoginDTO);

        return "redirect:/";
    }

}
