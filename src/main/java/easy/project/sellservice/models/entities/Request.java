package easy.project.sellservice.models.entities;

import easy.project.sellservice.models.entities.Code;
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
@Table(name = "requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long ID;

    @CreationTimestamp
    Date addDate;

    @ManyToOne
    @JoinColumn(name = "code_id")
    Code code;
}
