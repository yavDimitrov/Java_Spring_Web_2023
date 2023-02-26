package bg.softuni.state01.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CookieController {

    private static final String LAND_COOKIE_NAME = "lang";

    @GetMapping("/cookies")
    public  String cookies(Model model,
                           @CookieValue( name=LAND_COOKIE_NAME,
                           defaultValue = "en"
                           ) String lang) {
        
        model.addAttribute("lang", lang);
        return "cookies";
    }

//    @PostMapping("/cookies")
//    public String cookies() {
//        return "redirect:/cookies";
//    }


}
