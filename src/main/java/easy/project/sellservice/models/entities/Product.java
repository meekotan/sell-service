package easy.project.sellservice.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long ID;

    String name;
    @Column(unique = true)
    String barcode;

    boolean active;
    @ManyToOne
    @JoinColumn(name = "categories_id")
    Category category;

}
