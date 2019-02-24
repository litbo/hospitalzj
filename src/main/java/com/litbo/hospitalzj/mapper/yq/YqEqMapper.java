package com.litbo.hospitalzj.mapper.yq;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.litbo.hospitalzj.entity.YqRole;

/**
 * 设备仪器对应
 * @author 刘洋
 *
 */
public interface YqEqMapper {
	/*@Insert("insert into yq_eq (id, user_id, role_status, eq_id) value ("
			+ "#{id}, #{userId},#{roleStatus},#{eqId})") 
	Integer insertYqEq(YqEqVo yqEq);
	@Select("select id, user_id as userId, role_status as roleStatus, eq_id as eqId from yq_eq where id=#{id}")
	YqRole getYqEqe(Integer id);
	@Delete("delete from yq_eq where id=#{id}")
	Integer deleteInfo(Integer id);*/
}
