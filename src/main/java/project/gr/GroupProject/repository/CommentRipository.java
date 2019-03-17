package project.gr.GroupProject.repository;

import project.gr.GroupProject.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRipository extends JpaRepository<Comment, String> {
}
