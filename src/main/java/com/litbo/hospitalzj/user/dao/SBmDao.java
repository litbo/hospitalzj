package com.litbo.hospitalzj.user.dao;

import com.litbo.hospitalzj.user.bean.SBm;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 部门持久层
 */
@Mapper
public interface SBmDao {

    @Insert(" insert into s_bm (bm_id, bm_name, user_id, \n" +
            "      bm_tel, bm_addr, wx_flag, \n" +
            "      p_bm_id, obm_id, xbm_flag)\n" +
            "    values (#{bmId,jdbcType=CHAR}, #{bmName,jdbcType=VARCHAR}, #{userId,jdbcType=VARCHAR}, \n" +
            "      #{bmTel,jdbcType=VARCHAR}, #{bmAddr,jdbcType=VARCHAR}, #{wxFlag,jdbcType=CHAR}, \n" +
            "      #{pBmId,jdbcType=CHAR}, #{obmId,jdbcType=INTEGER}, #{xbmFlag,jdbcType=CHAR})")
    Integer insert(SBm sBm);
    @Delete("  delete from s_bm\n" +
            "    where bm_id = #{bmId,jdbcType=CHAR}")
    Integer  delete(String bmId);

    @Update("update s_bm\n" +
            "    set bm_name = #{bmName,jdbcType=VARCHAR},\n" +
            "      user_id = #{userId,jdbcType=VARCHAR},\n" +
            "      bm_tel = #{bmTel,jdbcType=VARCHAR},\n" +
            "      bm_addr = #{bmAddr,jdbcType=VARCHAR},\n" +
            "      wx_flag = #{wxFlag,jdbcType=CHAR},\n" +
            "      p_bm_id = #{pBmId,jdbcType=CHAR},\n" +
            "      obm_id = #{obmId,jdbcType=INTEGER},\n" +
            "      xbm_flag = #{xbmFlag,jdbcType=CHAR}\n" +
            "    where bm_id = #{bmId,jdbcType=CHAR}")
    Integer update(SBm sBm);

    @Select("Select * from s_bm where bm_id=#{bmId}")
    SBm select(String bmId);
    @Select("Select * from s_bm where  bm_name)=#{ bmName}")
    SBm selectByName(String bmName);
    @Select("Select * from s_bm")
    List<SBm> selectAll();
}
