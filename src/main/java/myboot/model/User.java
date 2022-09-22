package myboot.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "xuser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "cannot be empty")
    @Basic()
    @Column(name = "name")
    private String name;

    @NotBlank(message = "cannot be empty")
    @Basic()
    @Column(name = "firstName")
    private String firstName;

    @NotBlank(message = "cannot be empty")
    @Basic()
    @Column(name = "mail")
    private String mail;

    @NotBlank(message = "cannot be empty")
    @Basic()
    @Column(name = "website")
    private String website;

    @NotBlank(message = "cannot be empty")
    @Basic()
    @Column(name = "birthdate")
    private Date birthDate;

    @NotBlank(message = "cannot be empty")
    @Basic()
    @Column(name = "password")
    private String password;

    @OneToMany()
    private List<CV> cvs = new ArrayList<>();
}
