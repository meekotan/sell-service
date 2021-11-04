package easy.project.sellservice.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "discounts")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long ID;

    Date startDate;
    Date endDate;

    @ManyToOne
    @JoinColumn(name = "products_id")
    Product product;

}
