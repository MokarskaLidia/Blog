package model;


import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private int id;
    @Column (name = "user_name")
    private String user_name;
    @Column (name = "user_surname")
    private String user_surname;
    @Column(name = "user_email")
    private String user_email;
    @Email (message = "Podaj swój adres email")
    @NotEmpty(message = "wprowadź adres email")
    private String email;
    @Length (min = 5, message = "*Hasło powinno mieć minimum 5 znaków")
    @NotEmpty(message = "*Podaj hasło")
    private String password;

}
