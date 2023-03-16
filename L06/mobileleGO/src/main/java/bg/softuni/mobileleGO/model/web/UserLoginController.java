package bg.softuni.mobileleGO.model.web;

import bg.softuni.mobileleGO.model.dto.UserLoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserLoginController {

    @GetMapping("/users/login")
    public String login( ){
        return "auth-login";
    }

    @PostMapping ("/user/login")
    public String login(UserLoginDTO userLoginDTO) {
         System.out.println(userLoginDTO);

        return "redirect:/";


    }


}
