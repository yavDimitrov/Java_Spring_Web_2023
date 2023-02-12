package bg.softUni.mobilele.web;

import bg.softUni.mobilele.domain.dtoS.view.UserRoleViewDto;
import bg.softUni.mobilele.services.role.UserRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController extends BaseController {
    private final UserRoleService roleService;

    public UserController(UserRoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/register")
    public ModelAndView getRegister (ModelAndView modelAndView){
        List<UserRoleViewDto> roleServiceAll = this.roleService.getAll();
        modelAndView.addObject("roles", roleServiceAll);
        return super.view("auth-register", modelAndView);
    }

    @PostMapping("/register")
    public ModelAndView postRegister() {
        return super.redirect("auth-login");
    }
}
