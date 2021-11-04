package easy.project.sellservice.service;

import easy.project.sellservice.models.dto.CategoryDto;
import org.springframework.http.ResponseEntity;

public interface CategoryService {
    ResponseEntity<?> saveCategory(String token, CategoryDto categoryDto);

    ResponseEntity<?> getCategoryByName(String token, String name);

    ResponseEntity<?> getAllCategories(String token);
}
