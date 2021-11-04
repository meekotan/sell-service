package easy.project.sellservice.dao;

import easy.project.sellservice.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
