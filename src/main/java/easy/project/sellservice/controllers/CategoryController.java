package easy.project.sellservice.controllers;

import easy.project.sellservice.dao.CategoryRepo;
import easy.project.sellservice.models.dto.CategoryDto;
import easy.project.sellservice.service.CategoryService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/v1/categories")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryController {
    CategoryService categoryService;
    CategoryRepo categoryRepo;
    @Autowired
    CategoryController(CategoryRepo categoryRepo,CategoryService categoryService){
        this.categoryRepo = categoryRepo;
        this.categoryService = categoryService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveCategory(@RequestHeader String token, @RequestBody CategoryDto categoryDto){
        return categoryService.saveCategory(token, categoryDto);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateCategory(@RequestHeader String token, @RequestBody CategoryDto categoryDto){
        return categoryService.saveCategory(token, categoryDto);
    }

    @GetMapping("getByName")
    public ResponseEntity<?> getCategoryByNAme(@RequestHeader String token, @RequestParam String name){
        return categoryService.getCategoryByName(token, name);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllCategories(@RequestHeader String token){
        return categoryService.getAllCategories(token);
    }

}
