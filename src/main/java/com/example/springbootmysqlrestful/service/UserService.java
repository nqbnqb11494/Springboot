package com.example.springbootmysqlrestful.service;

import com.example.springbootmysqlrestful.dto.UserDto;
import com.example.springbootmysqlrestful.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<UserDto> getListUser();
    public ServiceResult findAll();
}
