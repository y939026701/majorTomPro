package com.majortom.bean;


import com.xuetang9.commons.jdbc.annotations.Column;

import java.util.List;

public class User {
  @Column("user_id")
  private long userId;
  @Column("user_name")
  private String userName;
  private long gender;
  private long age;
  private java.util.Date birthday;
  private String tel;
  private String email;
  private String address;
  @Column("id_num")
  private String idNum;
  /**
   * 权限列表
   */
  private List<Privilege> privileges;
  /**
   *  菜单列表
   */
  private List<Menu> menus;
  /**
   * 文件夹列表
   */
  private List<Folder> folders;
  /**
   * 页面列表
   */
  private List<PageElements> pageElements;

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public long getGender() {
    return gender;
  }

  public void setGender(long gender) {
    this.gender = gender;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public java.util.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.util.Date birthday) {
    this.birthday = birthday;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getIdNum() {
    return idNum;
  }

  public void setIdNum(String idNum) {
    this.idNum = idNum;
  }

  public List<Privilege> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(List<Privilege> privileges) {
    this.privileges = privileges;
  }

  public List<Menu> getMenus() {
    return menus;
  }

  public void setMenus(List<Menu> menus) {
    this.menus = menus;
  }

  public List<Folder> getFolders() {
    return folders;
  }

  public void setFolders(List<Folder> folders) {
    this.folders = folders;
  }

  public List<PageElements> getPageElements() {
    return pageElements;
  }

  public void setPageElements(List<PageElements> pageElements) {
    this.pageElements = pageElements;
  }
}
