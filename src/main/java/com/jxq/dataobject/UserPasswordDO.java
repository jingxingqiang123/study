package com.jxq.dataobject;

/**
 * 对应的user_password表
 * 为了安全将密码和数据分开
 */
public class UserPasswordDO {

    private Integer userId;

    private Integer id;
    /**加密信息*/
    private String encrptPassword;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEncrptPassword() {
        return encrptPassword;
    }

    public void setEncrptPassword(String encrptPassword) {
        this.encrptPassword = encrptPassword == null ? null : encrptPassword.trim();
    }
}