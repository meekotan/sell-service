package easy.project.sellservice.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OperationDetailsDto {
    Long ID;
    ProductDto productDto;
    OperationDto operationDto;
    int amount;
    double price;
}
