package project.gr.GroupProject.repository;

import org.springframework.stereotype.Repository;
import project.gr.GroupProject.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CommentRipository extends JpaRepository<Comment, String> {
}
