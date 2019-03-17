package project.gr.GroupProject.repository;

import project.gr.GroupProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//    User findByEmail(String email);

}
