package com.majortom.bean;


public class MovieGroupInfo {

  private long mInfoId;
  private long cIId;
  private String name;
  private String autograph;
  private String synopsis;
  private java.util.Date registerTime;
  private String activeCity;


  public long getMInfoId() {
    return mInfoId;
  }

  public void setMInfoId(long mInfoId) {
    this.mInfoId = mInfoId;
  }


  public long getCIId() {
    return cIId;
  }

  public void setCIId(long cIId) {
    this.cIId = cIId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAutograph() {
    return autograph;
  }

  public void setAutograph(String autograph) {
    this.autograph = autograph;
  }


  public String getSynopsis() {
    return synopsis;
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }


  public java.util.Date getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(java.util.Date registerTime) {
    this.registerTime = registerTime;
  }


  public String getActiveCity() {
    return activeCity;
  }

  public void setActiveCity(String activeCity) {
    this.activeCity = activeCity;
  }

}
