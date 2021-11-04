package easy.project.sellservice.dao;

import easy.project.sellservice.models.entities.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepo extends JpaRepository<Discount, Long> {
}
