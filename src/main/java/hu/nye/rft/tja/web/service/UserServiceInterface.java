
package hu.nye.rft.tja.web.service;

import java.util.List;

import hu.nye.rft.tja.data.domain.UserEntity;
import hu.nye.rft.tja.web.domain.UserView;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserServiceInterface extends UserDetailsService{
    UserEntity save(UserView userView);
   /*UserView getUserById(Long id);
    List<UserView> getAllUser();
    //void addUser(CreateUserRequest request);
    void deleteUserById(Long id);*/
}
