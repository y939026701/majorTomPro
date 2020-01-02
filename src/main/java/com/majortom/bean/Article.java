package com.majortom.bean;


public class Article {

  private long articleId;
  private long bindId;
  private String title;
  private java.util.Date publishTime;
  private String contentText;
  private long commentCount;
  private long likedCount;
  private long forwardCount;


  public long getArticleId() {
    return articleId;
  }

  public void setArticleId(long articleId) {
    this.articleId = articleId;
  }


  public long getBindId() {
    return bindId;
  }

  public void setBindId(long bindId) {
    this.bindId = bindId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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

}
