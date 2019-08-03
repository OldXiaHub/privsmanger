package org.taru.api.entity;


public class Permission {

  private String id;
  private String permissionName;
  private String parentId;
  private String permissionUlr;
  private String permissionPerms;
  private String permissionType;
  private String permissionIcon;
  private long permissionOrderNum;
  private String permissionCreateBy;
  private java.sql.Timestamp permissionCreateTime;
  private String permissionLastUpdateBy;
  private java.sql.Timestamp permissionLastUpdateTime;
  private String permissionLastDelFlag;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getPermissionName() {
    return permissionName;
  }

  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public String getPermissionUlr() {
    return permissionUlr;
  }

  public void setPermissionUlr(String permissionUlr) {
    this.permissionUlr = permissionUlr;
  }


  public String getPermissionPerms() {
    return permissionPerms;
  }

  public void setPermissionPerms(String permissionPerms) {
    this.permissionPerms = permissionPerms;
  }


  public String getPermissionType() {
    return permissionType;
  }

  public void setPermissionType(String permissionType) {
    this.permissionType = permissionType;
  }


  public String getPermissionIcon() {
    return permissionIcon;
  }

  public void setPermissionIcon(String permissionIcon) {
    this.permissionIcon = permissionIcon;
  }


  public long getPermissionOrderNum() {
    return permissionOrderNum;
  }

  public void setPermissionOrderNum(long permissionOrderNum) {
    this.permissionOrderNum = permissionOrderNum;
  }


  public String getPermissionCreateBy() {
    return permissionCreateBy;
  }

  public void setPermissionCreateBy(String permissionCreateBy) {
    this.permissionCreateBy = permissionCreateBy;
  }


  public java.sql.Timestamp getPermissionCreateTime() {
    return permissionCreateTime;
  }

  public void setPermissionCreateTime(java.sql.Timestamp permissionCreateTime) {
    this.permissionCreateTime = permissionCreateTime;
  }


  public String getPermissionLastUpdateBy() {
    return permissionLastUpdateBy;
  }

  public void setPermissionLastUpdateBy(String permissionLastUpdateBy) {
    this.permissionLastUpdateBy = permissionLastUpdateBy;
  }


  public java.sql.Timestamp getPermissionLastUpdateTime() {
    return permissionLastUpdateTime;
  }

  public void setPermissionLastUpdateTime(java.sql.Timestamp permissionLastUpdateTime) {
    this.permissionLastUpdateTime = permissionLastUpdateTime;
  }


  public String getPermissionLastDelFlag() {
    return permissionLastDelFlag;
  }

  public void setPermissionLastDelFlag(String permissionLastDelFlag) {
    this.permissionLastDelFlag = permissionLastDelFlag;
  }

}
