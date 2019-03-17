package project.gr.GroupProject.repository;

import org.springframework.stereotype.Repository;
import project.gr.GroupProject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PostRepository extends JpaRepository<Post,String> {
}
