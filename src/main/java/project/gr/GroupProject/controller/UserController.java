package project.gr.GroupProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import project.gr.GroupProject.model.User;
import project.gr.GroupProject.service.UserService;

import javax.validation.Valid;


@Controller
    public class UserController {

        UserService userService;

        @Autowired
        public UserController(UserService userService) {
            this.userService = userService;
        }

        // obsługa żądzania przekierowania na stronę formularza
        @GetMapping("/register")
        public String register(Model model){
            User user = new User();
            // dodajemy atrybut dla obiektu klasy Model ("nazwa stosowanana w html", nazwa bjektu Java)
            model.addAttribute("user", user);
            return "register";  // przekierowanie na widok formularza rejestracji (html)
        }
        // obsługa żądzania przekazania obiektu z formularz metodą post
        @PostMapping("/register")
        public String register(@ModelAttribute @Valid User user, BindingResult bindingResult){
            if(bindingResult.hasErrors()){
                return "registration";
            }
            // zapis do DB przez serwis użytkownika
            userService.registerUser(user);
            return "registration";
        }
    }

