package easy.project.sellservice.mappers;

import easy.project.sellservice.models.dto.ProductDto;
import easy.project.sellservice.models.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "category", source = "productDto.categoryDto")
    Product toProduct(ProductDto productDto);

    @Mapping(target = "categoryDto", source = "product.category")
    ProductDto toProductDto(Product product);
}
