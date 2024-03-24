package com.example.springbootmysqlrestful.service;

import com.example.springbootmysqlrestful.dto.MenuResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MenuService {

    public List<MenuResponse> findAllMenuInDiv(String userId, String type);
}
