package easy.project.sellservice.mappers;

import easy.project.sellservice.models.dto.CodeDto;
import easy.project.sellservice.models.entities.Code;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CodeMapper {
    CodeMapper INSTANCE = Mappers.getMapper(CodeMapper.class);

    @Mapping(target = "user", source = "codeDto.userDto")
    Code toCode(CodeDto codeDto);
    @Mapping(target = "userDto", source = "code.user")
    CodeDto toCodeDto(Code code);

}
