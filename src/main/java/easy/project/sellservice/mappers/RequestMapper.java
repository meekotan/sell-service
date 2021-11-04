
package easy.project.sellservice.mappers;

import easy.project.sellservice.models.dto.RequestDto;
import easy.project.sellservice.models.entities.Request;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RequestMapper {
    RequestMapper INSTANCE = Mappers.getMapper(RequestMapper.class);

    @Mapping(target = "code", source = "requestDto.codeDto")
    Request toRequest(RequestDto requestDto);
    @Mapping(target = "codeDto", source = "request.code")
    RequestDto toRequestDto(Request request);
}
