package com.majortom.bean;


public class HistoryLog {

  private long hIId;
  private long iId;
  private java.util.Date logTime;
  private long logIp;


  public long getHIId() {
    return hIId;
  }

  public void setHIId(long hIId) {
    this.hIId = hIId;
  }


  public long getIId() {
    return iId;
  }

  public void setIId(long iId) {
    this.iId = iId;
  }


  public java.util.Date getLogTime() {
    return logTime;
  }

  public void setLogTime(java.util.Date logTime) {
    this.logTime = logTime;
  }


  public long getLogIp() {
    return logIp;
  }

  public void setLogIp(long logIp) {
    this.logIp = logIp;
  }

}
