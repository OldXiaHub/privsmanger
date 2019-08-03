package org.taru.api.entity;


public class Role {

  private String roleId;
  private String roleName;
  private String roleRemark;
  private String create_By;
  private java.sql.Timestamp createTime;
  private String lastUpdateBy;
  private java.sql.Timestamp lastUpdateTime;
  private String delFlag;


  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getRoleRemark() {
    return roleRemark;
  }

  public void setRoleRemark(String roleRemark) {
    this.roleRemark = roleRemark;
  }


  public String getCreate_By() {
    return create_By;
  }

  public void setCreate_By(String create_By) {
    this.create_By = create_By;
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


  public java.sql.Timestamp getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(java.sql.Timestamp lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }


  public String getDelFlag() {
    return delFlag;
  }

  public void setDelFlag(String delFlag) {
    this.delFlag = delFlag;
  }

}
