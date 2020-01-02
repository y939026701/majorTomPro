package com.majortom.bean;


public class Comment {

  private long commentId;
  private long bindId;
  private long publishId;
  private String contentText;
  private java.util.Date publishTime;
  private long likedCount;
  private long type;


  public long getCommentId() {
    return commentId;
  }

  public void setCommentId(long commentId) {
    this.commentId = commentId;
  }


  public long getBindId() {
    return bindId;
  }

  public void setBindId(long bindId) {
    this.bindId = bindId;
  }


  public long getPublishId() {
    return publishId;
  }

  public void setPublishId(long publishId) {
    this.publishId = publishId;
  }


  public String getContentText() {
    return contentText;
  }

  public void setContentText(String contentText) {
    this.contentText = contentText;
  }


  public java.util.Date getPublishTime() {
    return publishTime;
  }

  public void setPublishTime(java.util.Date publishTime) {
    this.publishTime = publishTime;
  }


  public long getLikedCount() {
    return likedCount;
  }

  public void setLikedCount(long likedCount) {
    this.likedCount = likedCount;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }

}
