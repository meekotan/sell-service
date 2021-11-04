package easy.project.sellservice.dao;

import easy.project.sellservice.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    Object findByLogin(String login);
}
