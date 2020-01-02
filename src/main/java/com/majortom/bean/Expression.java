package com.majortom.bean;


public class Expression {

  private long expressionId;
  private long bindId;
  private java.util.Date publishTime;
  private String contentText;
  private long commentCount;
  private long likedCount;
  private long forwardCount;
  private long type;


  public long getExpressionId() {
    return expressionId;
  }

  public void setExpressionId(long expressionId) {
    this.expressionId = expressionId;
  }


  public long getBindId() {
    return bindId;
  }

  public void setBindId(long bindId) {
    this.bindId = bindId;
  }


  public java.util.Date getPublishTime() {
    return publishTime;
  }

  public void setPublishTime(java.util.Date publishTime) {
    this.publishTime = publishTime;
  }


  public String getContentText() {
    return contentText;
  }

  public void setContentText(String contentText) {
    this.contentText = contentText;
  }


  public long getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(long commentCount) {
    this.commentCount = commentCount;
  }


  public long getLikedCount() {
    return likedCount;
  }

  public void setLikedCount(long likedCount) {
    this.likedCount = likedCount;
  }


  public long getForwardCount() {
    return forwardCount;
  }

  public void setForwardCount(long forwardCount) {
    this.forwardCount = forwardCount;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }

}
