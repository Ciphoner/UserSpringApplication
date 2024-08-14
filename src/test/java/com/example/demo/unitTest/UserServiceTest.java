package com.example.demo.unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.User;
import com.example.demo.enums.SexeEnum;
import com.example.demo.models.UserDto;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;
import com.example.demo.services.impl.UserServiceImpl;

@SpringBootApplication
class UserServiceTest {

    @Mock
    UserRepository userRepository;

    UserService userService;

    AutoCloseable autoCloseable;

    @Test
    void testCreateUserWithSucess() {

        ArgumentCaptor<User> captor=ArgumentCaptor.forClass((User.class));

        //given(parametre qu'on a)
        //User u=new User("norvan",20,SexeEnum.MASCULIN,"norvan@gmail.com");

       when(userRepository.save(any (User.class))).thenReturn(new User("norvan",20,SexeEnum.MASCULIN,"norvan@gmail.com"));
       

        //when (lorsqu'on fait l'appel de la fonction à tester)
       // User user=userService.create(u);
        
        //then (resultat à obtenir)
        //assertEquals("norvan",user.getNom());
       // assertEquals(20,user.getAge());
      //  assertEquals(SexeEnum.MASCULIN,user.getSexe());
       // assertEquals("norvan@gmail.com",user.getEmail());
        
        //(userRepository, times(1)).save(captor.capture());
        //assertEquals("norvan",captor.getValue().getNom());
        //assertEquals(20,captor.getValue().getAge());

    }

    @BeforeEach
    void setup() {
        autoCloseable=MockitoAnnotations.openMocks(this);
        userService=new UserServiceImpl(userRepository);
    }
}
