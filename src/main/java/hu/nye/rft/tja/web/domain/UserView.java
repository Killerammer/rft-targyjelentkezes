package hu.nye.rft.tja.web.domain;

import lombok.*;

/**
 * Web layer representation of a user.
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserView implements Comparable<UserView>{
    private Long id;
    private String lastName;
    private String firstName;
    private String email;
    private String password;
    private boolean teacher;


    @Override
    public int compareTo(UserView o) {
        return id.compareTo(o.id);
    }
}
