package easy.project.sellservice.dao;

import easy.project.sellservice.models.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepo extends JpaRepository<Operation, Long> {
}
