package easy.project.sellservice.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDto {
    Long ID;
    String name;
    String barcode;
    boolean active;
    CategoryDto categoryDto;
}
