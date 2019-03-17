package project.gr.GroupProject.repository;

import project.gr.GroupProject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,String> {
}
