package easy.project.sellservice.dao;

import easy.project.sellservice.models.entities.OperationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationDetailsRepo extends JpaRepository<OperationDetails, Long> {
}
