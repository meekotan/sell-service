package easy.project.sellservice.models.responses;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class ErrorResponse {
    String message;
    String description;
}
