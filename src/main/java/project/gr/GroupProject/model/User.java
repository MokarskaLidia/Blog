package project.gr.GroupProject.model;


import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    @NotEmpty
    private String user_name;
    @Email(message = "Podaj swój adres email")
    @NotEmpty(message = "wprowadź adres email")
    private String user_email;
    @Length(min = 5, message = "*Hasło powinno mieć minimum 5 znaków")
    @NotEmpty(message = "*Podaj hasło")
    private String password;
    private String role;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "user")
    private List<Post> posts;

}