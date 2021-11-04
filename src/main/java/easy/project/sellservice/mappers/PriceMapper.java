package easy.project.sellservice.mappers;

import easy.project.sellservice.models.dto.PriceDto;
import easy.project.sellservice.models.entities.Price;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);

    @Mapping(target = "product", source = "priceDto.product")
    Price toPrice(PriceDto priceDto);
    @Mapping(target = "productDto", source = "price.product")
    PriceDto toPriceDto(Price price);
}
