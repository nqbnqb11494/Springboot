package com.example.springbootmysqlrestful;

import com.example.springbootmysqlrestful.entities.User;
import com.example.springbootmysqlrestful.service.Impl.UserServiceImpl;
import com.example.springbootmysqlrestful.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootMySqlRestfulApplication {

    public static void main(String[] args) {

        ApplicationContext context= SpringApplication.run(SpringbootMySqlRestfulApplication.class, args);
        UserService userService = context.getBean(UserService.class);
        System.out.println("userService 1: "+userService);
        UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
        System.out.println("userServiceImpl: "+userServiceImpl);

        String chuoi="   123456 789   ";
        String c=chuoi.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("chuoi:"+c+"hihi");

    }

}
