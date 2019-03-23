package project.gr.GroupProject.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class MyErrorController implements ErrorController {

        @GetMapping("/error")
        public String errorLogging() {
            // operacje dla error
            return "errorPage";
        }

        @GetMapping("/errorLogin")
        public String errorLoginLogging() {
            return "errorLogin";
        }
        // gdy nie ma mapingu na wskazany adres przechodzimy na /error

        @Override
        public String getErrorPath() {
            return "/error";
        }
    }
