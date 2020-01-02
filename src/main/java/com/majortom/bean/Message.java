package com.majortom.bean;


public class Message {

  private long messageId;
  private long bindId;
  private String title;
  private String contentText;
  private long type;


  public long getMessageId() {
    return messageId;
  }

  public void setMessageId(long messageId) {
    this.messageId = messageId;
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


  public String getContentText() {
    return contentText;
  }

  public void setContentText(String contentText) {
    this.contentText = contentText;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }

}
