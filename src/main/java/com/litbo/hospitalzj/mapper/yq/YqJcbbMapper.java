package com.litbo.hospitalzj.mapper.yq;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.litbo.hospitalzj.entity.YqJcbb;
import com.litbo.hospitalzj.entity.YqRole;

@Mapper
public interface YqJcbbMapper {
	@Insert("insert into yq_jcbb (jcbb_id ,data,jcbb_create_time, jcyq_id,eq_id,jcbb_jcr_id,jcbb_shr_id,jcbb_sh_status,jcjh_id) value ("
			+ "#{jcbbId}, #{data},#{jcbbCreateTime},#{jcyqId},#{eqId},#{jcbbJcrId},#{jcbbShrId},#{jcbbShStatus},#{jcjhId})") 
	Integer insertYqJcbb(YqJcbb yqJcbb);
	@Select("select jcbb_id as jcbbId,data,jcbb_create_time as jcbbCreateTime, "
			+ "jcyq_id as jcyqId,eq_id as eqId,jcbb_jcr_id as jcbbJcrId,jcbb_shr_id as jcbbShrId,"
			+ "jcbb_sh_status as jcbbShStatus,jcjh_id as jcjhId from yq_jcbb where jcbb_id=#{jcbbId}")
	YqJcbb getYqJcbb(Integer jcbbId);
	@Delete("delete from yq_jcbb where jcbb_id=#{jcbbId}")
	Integer deleteInfo(Integer jcbbId);
}
