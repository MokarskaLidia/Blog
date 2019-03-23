package project.gr.GroupProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String about() {
        //System.out.println("XXX");
        return "about";


    }

    @GetMapping("/addPost")
    public String testpost() {
        return "addPost";


    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping("/https://sdacademy.pl/")
    public String sda() {
        return "https://sdacademy.pl/";
    }


}