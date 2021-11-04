package easy.project.sellservice.service.impl;

import easy.project.sellservice.dao.CategoryRepo;
import easy.project.sellservice.mappers.CategoryMapper;
import easy.project.sellservice.models.dto.CategoryDto;
import easy.project.sellservice.models.entities.Category;
import easy.project.sellservice.models.responses.ErrorResponse;
import easy.project.sellservice.service.CategoryService;
import easy.project.sellservice.service.UserService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepo categoryRepo;
    private UserService userService;

    @Autowired
    public CategoryServiceImpl(CategoryRepo categoryRepo, UserSerevice userSerevice){
        this.categoryRepo = categoryRepo;
        this.userService = userSerevice;
    }

    @Override
    public ResponseEntity<?> saveCategory(String token, CategoryDto categoryDto) {
        ResponseEntity<?> responseEntity = userSesvice.verifyLogin(token);

        if(!responseEntity.getStatusCode().equals(HttpStatus.OK)){
            return responseEntity;
        }

        Category category = CategoryMapper.INSTANCE.toCategory(categoryDto);

        if(Objects.isNull(categoryRepo.findByName(category.getName()))){
            categoryRepo.save(category);
        }
        else{
            return new ResponseEntity<>(
                    new ErrorResponse("Category already exists.",null),HttpStatus.CONFLICT);
        }
        return  ResponseEntity.ok(CategoryMapper.INSTANCE.toCategoryDto(category));
    }

    @Override
    public ResponseEntity<?> getCategoryByName(String token, String name) {
        ResponseEntity<?> responseEntity = userService.verifyLogin(token);

        if(!responseEntity.getStatusCode().equals(HttpStatus.OK)){
            return responseEntity;
        }

        Category category = categoryRepo.findByName();

        if(Objects.isNull(category))
            return new ResponseEntity<>(new ErrorResponse("Category couldn't be found.",null),HttpStatus.NOT_FOUND);

        return ResponseEntity.ok(CategoryMapper.INSTANCE.toCategoryDto(category));

    }

    @SneakyThrows
    @Override
    public ResponseEntity<?> getAllCategories(String token) {
        ResponseEntity<?> responseEntity = userService.verifyLogin(token);

        if(!responseEntity.getStatusCode().equals(HttpStatus.OK))
            return responseEntity;

        List<Category> categories = categoryRepo.findAll();

        return ResponseEntity.ok(categories.stream().map(CategoryMapper.INSTANCE::toCategoryDto).collect(Collectors.toList()));
        s
    }
}
