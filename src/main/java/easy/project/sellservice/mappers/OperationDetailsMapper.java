package easy.project.sellservice.mappers;

import easy.project.sellservice.models.dto.OperationDetailsDto;
import easy.project.sellservice.models.entities.OperationDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OperationDetailsMapper {
    OperationDetailsMapper INSTANCE = Mappers.getMapper(OperationDetailsMapper.class);

    @Mapping(target = "product", source = "operationDetailsDto.productDto")
    @Mapping(target = "operation", source = "operationDetailsDto.operationDto")
    OperationDetails toOperationDetails(OperationDetailsDto operationDetailsDto);
    @Mapping(target = "productDto", source = "operationDetails.product")
    @Mapping(target = "operationDto", source = "operationDetails.operation")
    OperationDetailsDto toOperationDetailsDto(OperationDetails operationDetails);
}
