package com.example.springbootmysqlrestful.dto.mapper;

import com.example.springbootmysqlrestful.dto.UserDto;
import com.example.springbootmysqlrestful.entities.User;

public class UserMapper {
    public static UserDto toUserDto(User user){
        UserDto tmp = new UserDto();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        tmp.setPhone(user.getPhone());
        tmp.setAvatar(user.getAvatar());
        tmp.setEmail(user.getEmail());
        System.out.println("tmp: "+tmp);
        return tmp;
    }
}
