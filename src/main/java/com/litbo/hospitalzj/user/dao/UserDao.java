package com.litbo.hospitalzj.user.dao;


import com.litbo.hospitalzj.user.bean.SUser;
import com.litbo.hospitalzj.user.vo.SelectURVo;
import com.litbo.hospitalzj.user.vo.SelectUserVo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 用户持久层
 */
@Mapper
public interface UserDao {

    @Select("SELECT * FROM s_user WHERE user_name=#{userName}")
    SUser getUserByUsername(@Param(value = "userName") String username);

    @Insert("insert into s_user (user_id, user_name, user_pwd, bz) " +
            "  values (#{userId}, #{userName,jdbcType=VARCHAR}, #{userPwd,jdbcType=VARCHAR},#{bz,jdbcType=LONGVARCHAR})")
    Integer addUser(SUser u);
    @Insert("insert into s_user (user_id, user_name, user_pwd, bz) " +
            "  values (#{userId}, #{userName,jdbcType=VARCHAR}, #{userPwd,jdbcType=VARCHAR},#{bz,jdbcType=LONGVARCHAR})")
    Integer insertUser(@Param("userId") String userId, @Param("userName") String userName, @Param("userPwd") String userPwd, @Param("bz") String bz);

    @Update("update s_user " +
            "set  user_pwd = #{userPwd,jdbcType=VARCHAR}" +
            " where user_id = #{userId}")
    Integer updatePwd(@Param("userId") String userId, @Param("userPwd") String userPwd);

    @Delete("delete from s_user where user_id=#{userId}")
    Integer delete(String userId);

    @Select("SELECT u.user_id userId,u.user_name userName,r.role_name roleName FROM s_user u left join s_user_role ur on u.user_id=ur.user_id left join s_role r on ur.role_id=r.role_id")
    List<SelectURVo> findAll();
}
