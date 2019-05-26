package com.jxq.dataobject;

/**
 *对应的用户user_info
 */
public class UserDO {
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户名字
     */
    private String name;

    /**
     * 用户性别 1代表男性，2代表女性
      */
    private Byte gender;

    private Integer age;

    private String telphone;
    /**注册的方式byphone,bywechat，byaliplay*/
    private String registerMode;
    /**三种方式*/
    private String thirdPartyId;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }


    public Byte getGender() {
        return gender;
    }


    public void setGender(Byte gender) {
        this.gender = gender;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public String getTelphone() {
        return telphone;
    }


    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }


    public String getRegisterMode() {
        return registerMode;
    }

    public void setRegisterMode(String registerMode) {
        this.registerMode = registerMode == null ? null : registerMode.trim();
    }


    public String getThirdPartyId() {
        return thirdPartyId;
    }


    public void setThirdPartyId(String thirdPartyId) {
        this.thirdPartyId = thirdPartyId == null ? null : thirdPartyId.trim();
    }
}