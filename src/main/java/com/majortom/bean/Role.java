package com.majortom.bean;


public class Role {

  private long roleId;
  private String name;
  private String displayName;
  private java.util.Date createData;
  private String description;


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public java.util.Date getCreateData() {
    return createData;
  }

  public void setCreateData(java.util.Date createData) {
    this.createData = createData;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
