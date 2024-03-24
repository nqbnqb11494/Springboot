package com.example.springbootmysqlrestful.dto;

public class MenuResponse {
    private String menuId;
    private String menuName;
    private String menuNameEn;
    private String parentId;
    private String actionName;
    private String userId;
    private String icon;
    private boolean selected = false;
    private String isLeft;

    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getActionName() {
        return actionName;
    }
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
    public String getMenuId() {
        return menuId;
    }
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
    public String getMenuName() {
        return menuName;
    }
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public String getMenuNameEn() {
        return menuNameEn;
    }
    public void setMenuNameEn(String menuNameEn) {
        this.menuNameEn = menuNameEn;
    }
    public String getParentId() {
        return parentId;
    }
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getIsLeft() {
        return isLeft;
    }

    public void setIsLeft(String isLeft) {
        this.isLeft = isLeft;
    }
}
