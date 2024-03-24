package com.example.springbootmysqlrestful.controller;

import com.example.springbootmysqlrestful.constant.APIConstant;
import com.example.springbootmysqlrestful.dto.CommonRequest;
import com.example.springbootmysqlrestful.dto.MenuResponse;
import com.example.springbootmysqlrestful.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(APIConstant.MENU_API)
public class MenuController {
    @Autowired
    private MenuService menuService;

//    @DecryptData
    @PostMapping(value="/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<MenuResponse>> findAllMenuInDiv(@RequestBody CommonRequest commonRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(menuService.findAllMenuInDiv(commonRequest.getUserId(), commonRequest.getMenuType()));
    }
}
