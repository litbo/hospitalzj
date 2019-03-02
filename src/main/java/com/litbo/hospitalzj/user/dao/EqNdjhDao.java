package com.litbo.hospitalzj.user.dao;

import com.litbo.hospitalzj.user.bean.EqNdjh;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 年度计划持久层
 */
@Mapper
public interface EqNdjhDao {
    @Insert("insert into eq_ndjh (jcjh_id, eq_jcnf, user_id, \n" +
            "      eq_zjhjcl, eq_jcys, eq_jcyf, \n" +
            "      eq_jhwcsj, eq_shr, eq_shsj, \n" +
            "      eq_bz1, eq_bz2, eq_bz3, \n" +
            "      eq_bz4, eq_bz5)\n" +
            "    values (#{jcjhId,jdbcType=INTEGER}, #{eqJcnf,jdbcType=VARCHAR}, #{userId,jdbcType=INTEGER}, \n" +
            "      #{eqZjhjcl,jdbcType=VARCHAR}, #{eqJcys,jdbcType=DATE}, #{eqJcyf,jdbcType=VARCHAR}, \n" +
            "      #{eqJhwcsj,jdbcType=VARCHAR}, #{eqShr,jdbcType=VARCHAR}, #{eqShsj,jdbcType=VARCHAR}, \n" +
            "      #{eqBz1,jdbcType=VARCHAR}, #{eqBz2,jdbcType=VARCHAR}, #{eqBz3,jdbcType=VARCHAR}, \n" +
            "      #{eqBz4,jdbcType=VARCHAR}, #{eqBz5,jdbcType=VARCHAR})")
    EqNdjh insert(EqNdjh eqNdjh);
    @Update("update eq_ndjh\n" +
            "    set eq_jcnf = #{eqJcnf,jdbcType=VARCHAR},\n" +
            "      user_id = #{userId,jdbcType=INTEGER},\n" +
            "      eq_zjhjcl = #{eqZjhjcl,jdbcType=VARCHAR},\n" +
            "      eq_jcys = #{eqJcys,jdbcType=DATE},\n" +
            "      eq_jcyf = #{eqJcyf,jdbcType=VARCHAR},\n" +
            "      eq_jhwcsj = #{eqJhwcsj,jdbcType=VARCHAR},\n" +
            "      eq_shr = #{eqShr,jdbcType=VARCHAR},\n" +
            "      eq_shsj = #{eqShsj,jdbcType=VARCHAR},\n" +
            "      eq_bz1 = #{eqBz1,jdbcType=VARCHAR},\n" +
            "      eq_bz2 = #{eqBz2,jdbcType=VARCHAR},\n" +
            "      eq_bz3 = #{eqBz3,jdbcType=VARCHAR},\n" +
            "      eq_bz4 = #{eqBz4,jdbcType=VARCHAR},\n" +
            "      eq_bz5 = #{eqBz5,jdbcType=VARCHAR}\n" +
            "    where jcjh_id = #{jcjhId,jdbcType=INTEGER}")
    Integer update(EqNdjh eqNdjh);

    @Select("select * from eq_ndjh where jcjh_id=#{jcjhId}")
    EqNdjh select(Integer jcjhId);

    @Select("select * from eq_ndjh")
    List<EqNdjh> selectAll();

    @Delete("delete from eq_ndjh\n" +
            "    where jcjh_id = #{jcjhId,jdbcType=INTEGER}")
    Integer delete(Integer jcjhId);
}
