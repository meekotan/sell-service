package easy.project.sellservice.dao;

import easy.project.sellservice.models.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
    Object findByName(String name);
}
