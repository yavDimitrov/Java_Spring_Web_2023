package bg.softuni.state01.web;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpResponse;

@Controller
public class CookieController {

    private static final String LAND_COOKIE_NAME = "lang";

    @GetMapping("/cookies")
    public  String cookies(Model model, @CookieValue(name=LAND_COOKIE_NAME, defaultValue = "en") String lang) {
        model.addAttribute("lang", lang);
        return "cookies";
    }

    @PostMapping("/cookies")
    public String cookies(HttpServletResponse response, @RequestParam("language") String language) {
        Cookie cookie = new Cookie(LAND_COOKIE_NAME, language);
        response.addCookie(cookie);

        return "redirect:/cookies";
    }


}
