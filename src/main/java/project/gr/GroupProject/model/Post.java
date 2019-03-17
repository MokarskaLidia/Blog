package project.gr.GroupProject.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int post_id;
    @NotEmpty
    private String post_title;
    @NotEmpty
    private String post_content;
    @NotEmpty
    private String post_tag;
    private LocalDateTime ldt= LocalDateTime.now();
    @ManyToOne
    @JoinColumn(name = "user_user_id")
    User user;
}
