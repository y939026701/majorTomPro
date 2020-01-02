package com.majortom.bean;


/**
 * @author 李文海
 */
public class Achievement {

  private long achievementId;
  private long iId;
  private String name;
  private String description;
  private long state;


  public long getAchievementId() {
    return achievementId;
  }

  public void setAchievementId(long achievementId) {
    this.achievementId = achievementId;
  }


  public long getIId() {
    return iId;
  }

  public void setIId(long iId) {
    this.iId = iId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

}
