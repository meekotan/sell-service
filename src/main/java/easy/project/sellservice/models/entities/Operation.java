package easy.project.sellservice.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "operations")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long ID;

    @CreationTimestamp
    Date addDate;

    double totalPrice;
    double change;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
