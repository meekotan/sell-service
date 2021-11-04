package easy.project.sellservice.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PriceDto {
    Long ID;
    double price;
    Date startDate;
    Date endDate;
    ProductDto productDto;
}
