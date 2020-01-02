package com.majortom.bean;


public class Menu {

  private long menuId;
  private String name;
  private String menuUrl;
  private long parentId;


  public long getMenuId() {
    return menuId;
  }

  public void setMenuId(long menuId) {
    this.menuId = menuId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getMenuUrl() {
    return menuUrl;
  }

  public void setMenuUrl(String menuUrl) {
    this.menuUrl = menuUrl;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }

}
