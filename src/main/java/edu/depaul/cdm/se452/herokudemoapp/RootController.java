package edu.depaul.cdm.se452.herokudemoapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {
    @Value( "${spring.profiles.active}" )
    private String profile;
        
    @GetMapping("/profile")
    @ResponseBody
    public String greetPage() {
        return "Hello, you are using " + profile + " profile";
    }
}
