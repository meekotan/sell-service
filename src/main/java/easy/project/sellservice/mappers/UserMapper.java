package easy.project.sellservice.mappers;

import easy.project.sellservice.models.dto.UserDto;
import easy.project.sellservice.models.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toUSer(UserDto userDto);
    UserDto toUserDto(User user);
}
