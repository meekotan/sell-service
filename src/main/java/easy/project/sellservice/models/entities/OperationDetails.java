package easy.project.sellservice.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "operation_details")
public class OperationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long ID;

    @ManyToOne
    @JoinColumn(name = "products_id")
    Product product;

    @ManyToOne
    @JoinColumn(name = "operations_id")
    Operation operation;

    int amount;
    double price;





}
