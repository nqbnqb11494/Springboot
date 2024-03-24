package com.example.springbootmysqlrestful.repository;

import com.example.springbootmysqlrestful.dto.MenuResponse;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@Repository
@RequestScope
public class MenuRepositoryImpl implements MenuRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<MenuResponse> findAllMenuInDiv(String userId, String type) {
//        userId ="101057401";
//        System.out.println("user id 1: "+userId);
//        System.out.println("MenuRepositoryImpl findAllMenuInDiv user: "+userId);
//        System.out.println("MenuRepositoryImpl findAllMenuInDiv type: "+type);
        String sql = "SELECT MENUID, MENUNAME, MENUNAME_EN AS menuNameEn, ACTIONNAME\r\n" +
                "FROM IBS_MENU_IND_NEW WHERE ISPUBLISHED ='Y' AND PARENTID IS NOT NULL AND MENUTYPE='1' AND CATEGORYTYPE = ? ORDER BY MENUNAME ASC";
        return jdbcTemplate.query(sql, new Object[] {type}, BeanPropertyRowMapper.newInstance(MenuResponse.class));
    }
    @Override
    public List<MenuResponse> findMenuSelected(String userId, String type) {
//        userId = "101057401";
//        type="C";
//        System.out.println("MenuRepositoryImpl findMenuSelected user: "+userId);
//        System.out.println("MenuRepositoryImpl findMenuSelected type: "+type);
        userId = userId.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("MenuRepositoryImpl findMenuSelected user: "+userId);
        String sql = "SELECT UF.MENUID, M.MENUNAME, M.ICON, M.MENUNAME_EN as menuNameEn, M.ACTIONNAME\r\n" +
                "  FROM IBS_USERMENU_FASTACCESS UF, IBS_MENU_IND_NEW M\r\n" +
                "  WHERE UF.MENUID = M.MENUID AND UF.USERID = ? AND UF.TYPE = ? ORDER BY UF.PRIORITY ASC";
        return jdbcTemplate.query(sql, new Object[] {userId, type}, BeanPropertyRowMapper.newInstance(MenuResponse.class));
    }
}
