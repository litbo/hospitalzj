package com.litbo.hospitalzj.mapper.yq;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.litbo.hospitalzj.entity.YqMould;


/**
 * 仪器模板
 * @author 刘洋
 *
 */
@Mapper
public interface YqMouldMapper {
	@Insert("insert into yq_mould ( mb_id,data,create_time, mb_status,mb_name) value ("
			+ "#{mbId}, #{data},#{createTime},#{mbStatus},#{mbName})") 
	Integer insertYqMould(YqMould yqMould);
	@Select("select  mb_id as mbId,data,create_time as createTime,mb_status mbStatus,mb_name as mbName from yq_mould where mb_id=#{mbId}")
	YqMould getYqMould(Integer id);
	@Delete("delete from YqMould where mb_id=#{mbId}")
	Integer deleteInfo(Integer id);
}
