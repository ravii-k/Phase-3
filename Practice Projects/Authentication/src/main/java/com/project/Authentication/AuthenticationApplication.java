package com.project.Authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.project.Authentication.controllers.AuthenticationController;
import com.project.Authentication.entities.User;
import com.project.Authentication.exceptions.UserNotFoundException;
import com.project.Authentication.services.AuthenticationService;

@SpringBootApplication
@Import({
      AuthenticationController.class,
      UserNotFoundException.class,
      AuthenticationService.class,
      User.class
})
public class AuthenticationApplication {

   public static void main(String[] args) {
      SpringApplication.run(AuthenticationApplication.class, args);
   }

}