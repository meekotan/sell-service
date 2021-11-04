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
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long ID;
    String name;
    @Column(unique = true)
    String login;
    boolean active;
    @Column(unique = true)
    String email;
    Date endOfBlockDate;

}
