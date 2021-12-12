package hu.nye.rft.tja.data.dao;

import java.util.Collection;

import hu.nye.rft.tja.data.domain.UserEntity;
import hu.nye.rft.tja.data.repository.UserRepository;
import hu.nye.rft.tja.error.EmailAlreadyInUseException;
import hu.nye.rft.tja.error.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

@Component
public class DefaultUserDataAccessObject implements UserDataAccessObjectInterface {

    private UserRepository userRepository;

    @Autowired
    public DefaultUserDataAccessObject(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity getUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));
    }

    @Override
    public Collection<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(UserEntity entity) {
        try{
            userRepository.save(entity);
        }catch (DataIntegrityViolationException e){
            throw new EmailAlreadyInUseException("Email address: "+ entity.getEmail() + " already in use.");
        }catch (Exception e){
            throw new RuntimeException("Opps, something went wrong.");
        }
    }

    @Override
    public void deleteUserById(Long id) {
        try{
            userRepository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new UserNotFoundException("User not found with id: " + id);
        }catch (Exception e){
            throw new RuntimeException("Opps, something went wrong.");
        }
    }
}