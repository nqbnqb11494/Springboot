package com.example.springbootmysqlrestful.service;

import com.example.springbootmysqlrestful.dto.MenuResponse;
import com.example.springbootmysqlrestful.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequestScope
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuRepository menuRepository;

    @Override
    public List<MenuResponse> findAllMenuInDiv(String userId, String type) {
        userId = "     101057401";
        type="C";
        System.out.println("MenuServiceImpl user: "+userId);
        System.out.println("MenuServiceImpl type: "+type);

        List<MenuResponse> responses = menuRepository.findAllMenuInDiv(userId, type);
        List<MenuResponse> list = menuRepository.findMenuSelected(userId, type);
        List<String> strings = list.stream().map(MenuResponse::getMenuId).distinct().collect(Collectors.toList());
        if(!strings.isEmpty()) {
            for(MenuResponse item : responses) {
                item.setSelected(strings.contains(item.getMenuId()));
            }
        }
        return responses;
    }
}
