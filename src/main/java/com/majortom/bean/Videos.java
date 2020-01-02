package com.majortom.bean;


public class Videos {

  private long vId;
  private long cIId;
  private String name;
  private String intro;


  public long getVId() {
    return vId;
  }

  public void setVId(long vId) {
    this.vId = vId;
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


  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }

}
