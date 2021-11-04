package easy.project.sellservice.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OperationDto {
    Long ID;
    Date addDate;
    double totalPrice;
    double change;
    UserDto userDto;
}
