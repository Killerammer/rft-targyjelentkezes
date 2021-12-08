package hu.nye.rft.tja.data.domain;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a user in the database. Contains the users' id, name, shopping lists.
 */
@Entity
@Table(name = "user")
@NoArgsConstructor
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "email", nullable = false, unique = true)
    private String emailAddress;

}
