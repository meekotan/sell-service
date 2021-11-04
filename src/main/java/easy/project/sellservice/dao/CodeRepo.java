package easy.project.sellservice.dao;

import easy.project.sellservice.models.entities.Code;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeRepo extends JpaRepository<Code, Long>{
}
