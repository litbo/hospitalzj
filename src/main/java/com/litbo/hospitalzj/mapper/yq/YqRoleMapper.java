package com.litbo.hospitalzj.mapper.yq;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.litbo.hospitalzj.entity.Yq;
import com.litbo.hospitalzj.entity.YqRole;


/**
 * 人员分配仪器
 * @author 刘洋
 *
 */
@Mapper
public interface YqRoleMapper {
	@Insert("insert into yq_role (id, user_id, role_status, eq_id) value ("
			+ "#{id}, #{userId},#{roleStatus},#{eqId})") 
	Integer insertYqRole(YqRole yqRole);
	@Select("select id, user_id as userId, role_status as roleStatus, eq_id as eqId from yq_role where id=#{id}")
	YqRole getYqRole(Integer id);
	@Delete("delete from yq_role where id=#{id}")
	Integer deleteInfo(Integer id);
}
