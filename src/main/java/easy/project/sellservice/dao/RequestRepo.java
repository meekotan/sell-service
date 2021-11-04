package easy.project.sellservice.dao;

import easy.project.sellservice.models.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepo extends JpaRepository<Request, Long> {
}
