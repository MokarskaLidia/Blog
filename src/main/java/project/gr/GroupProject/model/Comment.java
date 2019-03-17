package project.gr.GroupProject.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comment_id;
    private String comment_message;
    private LocalDateTime ldt= LocalDateTime.now();
    @ManyToOne
    @JoinColumn(name = "post_post_id")
    Post post;
}
