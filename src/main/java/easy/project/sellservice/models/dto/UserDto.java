package easy.project.sellservice.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    Long ID;
    String name;
    String login;
    boolean active;
    String email;
    Date endOFBLockDate;
}
