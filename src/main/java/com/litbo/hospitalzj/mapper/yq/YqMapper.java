package com.litbo.hospitalzj.mapper.yq;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.litbo.hospitalzj.entity.Yq;

/**
 * 检测仪器持久层
 */
@Mapper
public interface YqMapper {

	@Insert("insert into yq (jcyq_id,jcyq_name,jcyq_xh,jcyq_xzzq_time,jcyq_dah,jcyq_bh,jcyq_cj_id,jcyq_qy_time,jcyq_ks_id,"+
			"jcyq_cf,jcyq_url,jcyq_jz_time,mb_id) value (#{jcyqId}, #{jcyqName},#{jcyqXh},#{jcyqXzzqTime},#{jcyqDah},#{jcyqBh},#{jcyqCjId},"+
			"#{jcyqQyTime},#{jcyqKsId},#{jcyqCf},#{jcyqUrl},#{jcyqJzTime},#{mbId})") 
	Integer insert(Yq yq);

	@Select("select * from yq where jcyq_id=#{jcyqId}")
	Yq select(String jcyqId);
	
	@Update(" update yq\n" +
			"    set jcyq_name = #{jcyqName,jdbcType=VARCHAR},\n" +
			"      jcyq_xh = #{jcyqXh,jdbcType=VARCHAR},\n" +
			"      jcyq_xzzq_time = #{jcyqXzzqTime,jdbcType=VARCHAR},\n" +
			"      jcyq_dah = #{jcyqDah,jdbcType=VARCHAR},\n" +
			"      jcyq_bh = #{jcyqBh,jdbcType=VARCHAR},\n" +
			"      jcyq_cj_id = #{jcyqCjId,jdbcType=INTEGER},\n" +
			"      jcyq_qy_time = #{jcyqQyTime,jdbcType=TIMESTAMP},\n" +
			"      jcyq_ks_id = #{jcyqKsId,jdbcType=INTEGER},\n" +
			"      jcyq_cf = #{jcyqCf,jdbcType=VARCHAR},\n" +
			"      jcyq_url = #{jcyqUrl,jdbcType=VARCHAR},\n" +
			"      jcyq_jz_time = #{jcyqJzTime,jdbcType=TIMESTAMP},\n" +
			"      mb_id = #{mbId,jdbcType=INTEGER}\n" +
			"    where jcyq_id = #{jcyqId,jdbcType=VARCHAR}")
	Integer update(Yq yq);

	@Delete("delete from yq where jcyq_id=#{jcyqId}")
	Integer delete(Integer jcyqId);

} 