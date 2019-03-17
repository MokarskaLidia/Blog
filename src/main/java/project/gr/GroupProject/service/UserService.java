package project.gr.GroupProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project.gr.GroupProject.model.User;
import project.gr.GroupProject.repository.UserRepository;

@Service
public class UserService {
    UserRepository userRepository;
//    PasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService (UserRepository userRepository){
//        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this. userRepository = userRepository;
    }
    public boolean registerUser(User user){
        try {
//            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            userRepository.save(user);
            return true;
        } catch(NullPointerException ex){
            ex.printStackTrace();
        }
        return false;
    }
}

