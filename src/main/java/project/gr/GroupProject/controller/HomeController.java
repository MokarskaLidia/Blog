package project.gr.GroupProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String about(){
        System.out.println("XXX");
        return "about";


    }

    @GetMapping("/contact")
    public String testpost(){
        return "addPost";


    }
}

