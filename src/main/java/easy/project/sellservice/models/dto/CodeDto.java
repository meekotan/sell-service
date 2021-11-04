package easy.project.sellservice.models.dto;

import easy.project.sellservice.models.enums.CodeStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodeDto {
    Long ID;
    String code;
    Date startDate;
    Date endDate;
    CodeStatus codeStatus;
    UserDto userDto;

}
