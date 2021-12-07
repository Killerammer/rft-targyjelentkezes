package hu.nye.rft.tja.web.domain;

import lombok.Builder;
import lombok.Data;

/**
 * Web layer representation of a user.
 */
@Data
@Builder
public class UserView implements Comparable<UserView>{
    private Long id;
    private String userName;
    private String emailAddress;

    @Override
    public int compareTo(UserView o) {
        return userName.compareTo(o.userName);
    }
}
