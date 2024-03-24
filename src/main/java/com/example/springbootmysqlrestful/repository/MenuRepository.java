package com.example.springbootmysqlrestful.repository;

import com.example.springbootmysqlrestful.dto.MenuResponse;

import java.util.List;

public interface MenuRepository {
    List<MenuResponse> findAllMenuInDiv(String userId, String type);
    List<MenuResponse> findMenuSelected(String userId, String type);
}
