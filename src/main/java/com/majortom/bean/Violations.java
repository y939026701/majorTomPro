package com.majortom.bean;


public class Violations {

  private long violationsId;
  private long bindId;
  private long type;
  private String concreteContent;
  private java.util.Date violationsTime;


  public long getViolationsId() {
    return violationsId;
  }

  public void setViolationsId(long violationsId) {
    this.violationsId = violationsId;
  }


  public long getBindId() {
    return bindId;
  }

  public void setBindId(long bindId) {
    this.bindId = bindId;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public String getConcreteContent() {
    return concreteContent;
  }

  public void setConcreteContent(String concreteContent) {
    this.concreteContent = concreteContent;
  }


  public java.util.Date getViolationsTime() {
    return violationsTime;
  }

  public void setViolationsTime(java.util.Date violationsTime) {
    this.violationsTime = violationsTime;
  }

}
