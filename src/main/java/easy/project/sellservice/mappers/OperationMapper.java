package easy.project.sellservice.mappers;

import easy.project.sellservice.models.dto.OperationDto;
import easy.project.sellservice.models.entities.Operation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OperationMapper {
    OperationMapper INSTANCE = Mappers.getMapper(OperationMapper.class);

    @Mapping(target = "user", source = "operationDto.userDto")
    Operation toOperation(OperationDto operationDto);

    @Mapping(target = "userDto", source = "operation.user")
    OperationDto toOperationDto(Operation operation);

}
