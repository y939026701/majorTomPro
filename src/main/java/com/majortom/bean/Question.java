package com.majortom.bean;


public class Question {

  private long questionId;
  private String questionText;
  private String contentText;
  private long type;


  public long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(long questionId) {
    this.questionId = questionId;
  }


  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
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
