package hu.nye.rft.tja.data.dao;

import java.util.Collection;
import hu.nye.rft.tja.data.domain.UserEntity;
import hu.nye.rft.tja.error.EmailAlreadyInUseException;
import hu.nye.rft.tja.error.UserNotFoundException;

public interface UserDataAccessObjectInterface {
    UserEntity getUserById(Long userId);
    Collection<UserEntity> getAllUser();
    void addUser(UserEntity entity);
    void deleteUserById(Long id);
}
