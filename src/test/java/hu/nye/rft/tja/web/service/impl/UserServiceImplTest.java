package hu.nye.rft.tja.web.service.impl;

import hu.nye.rft.tja.data.domain.UserEntity;
import hu.nye.rft.tja.web.domain.UserView;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @Mock
    private UserView userView;

    @InjectMocks
    private UserServiceImpl underTest;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    public void tearDown(){
        underTest=null;
    }

    @Test
    public void entityTest(){
        //given
        UserEntity entity = new UserEntity();
        entity.setEmail("killerrammer@gmail.com");
        entity.setFirstName("Kristóf");
        entity.setLastName("Juhász");
        entity.setTeacher(false);
        //when
        Assertions.assertFalse(entity.getEmail().isEmpty());
        Assertions.assertFalse(entity.getFirstName().isEmpty());
        Assertions.assertFalse(entity.getLastName().isEmpty());
        //then
    }
}
