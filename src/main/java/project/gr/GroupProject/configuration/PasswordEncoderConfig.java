package project.gr.GroupProject.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
//public class PasswordEncoderConfig extends WebSecurityConfigurerAdapter {
//
//    @Bean
//    public PasswordEncoder encode(){
//        return new BCryptPasswordEncoder();
//    }
//}
