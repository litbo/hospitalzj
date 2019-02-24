package com.litbo.hospitalzj.mapper.yq;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.litbo.hospitalzj.entity.YqJcjh;
/**
 * 检测计划
 * @author 刘洋
 *
 */
@Mapper
public interface YqJcjhMapper {
	@Insert("insert into yq_jcjh (jcjh_id, eq_id, jcjh_status, creat_time,wc_time,fbr_id,shr_id) value ("
			+ "#{jcjhId}, #{eqId},#{jcjhStatus},#{creatTime},#{wcTime},#{fbrId},#{shrId})") 
	Integer insertYqJcjh(YqJcjh yqJcjh);
	@Select("select jcjh_id as jcjhId, eq_id as eqId, jcjh_status as jcjhStatus,creat_time as creatTime,"
			+ "wc_time as wcTime,fbr_id as fbrId,shr_id as shrId from yq_jcjh where jcjh_id=#{jcjhId}")
	YqJcjh getYqJcjh(Integer jcjhId);
	@Delete("delete from yq_jcjh where jcjh_id=#{jcjhId}")
	Integer deleteInfo(Integer jcjhId);
}
