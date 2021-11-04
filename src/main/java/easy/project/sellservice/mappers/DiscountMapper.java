package easy.project.sellservice.mappers;

import easy.project.sellservice.models.dto.DiscountDto;
import easy.project.sellservice.models.entities.Discount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DiscountMapper {
    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);

    @Mapping(target = "product", source = "discountDto.productDto")
    Discount toDiscount(DiscountDto discountDto);

    @Mapping(target = "productDto", source = "discount.product")
    DiscountDto toDiscountDto(Discount discount);

}
