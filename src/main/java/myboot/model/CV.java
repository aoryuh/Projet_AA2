package myboot.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class CV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "cannot be empty")
    @Basic()
    @Column(name = "year")
    private Date year;

    @NotBlank(message = "cannot be empty")
    @Basic()
    @Column(name = "type")
    private String type;

    @NotBlank(message = "cannot be empty")
    @Basic()
    @Column(name = "title")
    private String title;

    @Basic()
    @Column(name = "description")
    private String description;

    @Basic()
    @Column(name = "website")
    private String website;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;
}
