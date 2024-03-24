package com.example.springbootmysqlrestful.service.Impl;

import com.example.springbootmysqlrestful.dto.UserDto;
import com.example.springbootmysqlrestful.dto.mapper.UserMapper;
import com.example.springbootmysqlrestful.entities.User;
import com.example.springbootmysqlrestful.repository.UserRepository;
import com.example.springbootmysqlrestful.service.ServiceResult;
import com.example.springbootmysqlrestful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1,"Nguyen Van A","nguyenvana@gmail.com","0939465999","avatar1.img","nguyenvana123"));
        users.add(new User(2,"Nguyen Van B","nguyenvanb@gmail.com","0939465999","avatar2.img","nguyenvanb123"));
        users.add(new User(3,"Nguyen Van C","nguyenvanc@gmail.com","0939465999","avatar3.img","nguyenvanC123"));
        users.add(new User(4,"Nguyen Van D","nguyenvand@gmail.com","0939465999","avatar4.img","nguyenvanD123"));
        System.out.println("List user1: "+users);
        for (User user: users){
            System.out.println("get user: "+user.getName());

        }
    }

    @Override
    public List<UserDto> getListUser() {
        List<UserDto> result = new ArrayList<UserDto>();
        for (User user: users){
            System.out.println("List user2: "+users);
            System.out.println("user: "+user.getName());
            result.add(UserMapper.toUserDto(user));
        }
        System.out.println("result: "+result);
        return result;
    }

    public ServiceResult findAll(){
        ServiceResult result = new ServiceResult();
        result.setData(userRepository.findAll());

        return result;
    }
}
