package com.majortom.bean;


public class Punish {

  private long punishId;
  private long violationsId;
  private java.util.Date time;
  private long timeLength;
  private long type;


  public long getPunishId() {
    return punishId;
  }

  public void setPunishId(long punishId) {
    this.punishId = punishId;
  }


  public long getViolationsId() {
    return violationsId;
  }

  public void setViolationsId(long violationsId) {
    this.violationsId = violationsId;
  }


  public java.util.Date getTime() {
    return time;
  }

  public void setTime(java.util.Date time) {
    this.time = time;
  }


  public long getTimeLength() {
    return timeLength;
  }

  public void setTimeLength(long timeLength) {
    this.timeLength = timeLength;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }

}
