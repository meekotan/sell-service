package easy.project.sellservice.mappers;

import easy.project.sellservice.models.dto.CategoryDto;
import easy.project.sellservice.models.entities.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    Category toCategory(CategoryDto categoryDto);
    CategoryDto toCategoryDto(Category category);
}
