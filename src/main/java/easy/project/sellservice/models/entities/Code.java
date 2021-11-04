package easy.project.sellservice.models.entities;
import easy.project.sellservice.models.enums.CodeStatus;
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
@Table(name = "codes")
public class Code {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long ID;

    @Column(unique = true)
    String code;

    @CreationTimestamp
    Date startDate;
    Date endDate;

    @Enumerated(EnumType.STRING)
    CodeStatus codeStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
