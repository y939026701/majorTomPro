package com.majortom.bean;


public class Complaint {

  private long complaintId;
  private long toComplaintId;
  private long bindId;
  private long type;
  private long contentId;
  private long dispose;


  public long getComplaintId() {
    return complaintId;
  }

  public void setComplaintId(long complaintId) {
    this.complaintId = complaintId;
  }


  public long getToComplaintId() {
    return toComplaintId;
  }

  public void setToComplaintId(long toComplaintId) {
    this.toComplaintId = toComplaintId;
  }


  public long getBindId() {
    return bindId;
  }

  public void setBindId(long bindId) {
    this.bindId = bindId;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public long getContentId() {
    return contentId;
  }

  public void setContentId(long contentId) {
    this.contentId = contentId;
  }


  public long getDispose() {
    return dispose;
  }

  public void setDispose(long dispose) {
    this.dispose = dispose;
  }

}
