package com.example.springbootmysqlrestful.controller;

import com.example.springbootmysqlrestful.dto.UserDto;
import com.example.springbootmysqlrestful.entities.User;
import com.example.springbootmysqlrestful.service.ServiceResult;
import com.example.springbootmysqlrestful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class MyController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getListUser(){
        System.out.println("controller 1");
        System.out.println("userService 2: "+userService);

        List<UserDto> users = userService.getListUser();
        System.out.println("controller 2");

        return ResponseEntity.ok(users);
    }

    @GetMapping("/findall")
    public ResponseEntity<ServiceResult> findAll() {
        return new ResponseEntity<ServiceResult>(userService.findAll(), HttpStatus.OK);
    }
}
