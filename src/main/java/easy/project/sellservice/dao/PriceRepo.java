package easy.project.sellservice.dao;

import easy.project.sellservice.models.entities.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepo extends JpaRepository<Price, Long> {
}
