package org.taru.api.entity;


public class User {

  private String userId;
  private String userName;
  private String userPassword;
  private String mobile;
  private String userEmail;
  private String userStatus;
  private String createBy;
  private java.sql.Timestamp createTime;
  private String lastUpdateBy;
  private String delFlag;
  private java.sql.Timestamp lastUpdateTime;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public String getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(String userStatus) {
    this.userStatus = userStatus;
  }


  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getLastUpdateBy() {
    return lastUpdateBy;
  }

  public void setLastUpdateBy(String lastUpdateBy) {
    this.lastUpdateBy = lastUpdateBy;
  }


  public String getDelFlag() {
    return delFlag;
  }

  public void setDelFlag(String delFlag) {
    this.delFlag = delFlag;
  }


  public java.sql.Timestamp getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(java.sql.Timestamp lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

}
