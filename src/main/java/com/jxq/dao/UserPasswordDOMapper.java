package com.jxq.dao;

import com.jxq.dataobject.UserPasswordDO;

public interface UserPasswordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sun May 26 15:57:19 CST 2019
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sun May 26 15:57:19 CST 2019
     */
    int insert(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sun May 26 15:57:19 CST 2019
     */
    int insertSelective(UserPasswordDO record);

    /**
     * 根据用户id,查询用户加密密码信息
     * @param userId
     * @return
     */
    UserPasswordDO selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sun May 26 15:57:19 CST 2019
     */
    int updateByPrimaryKey(UserPasswordDO record);
}