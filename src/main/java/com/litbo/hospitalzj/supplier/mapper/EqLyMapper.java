package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqJfly;
import org.apache.ibatis.annotations.*;
import org.w3c.dom.ls.LSInput;

import com.litbo.hospitalzj.supplier.entity.EqLy;
/**
 * 设备来源持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface EqLyMapper {
	@Select("SELECT eqly_id eqlyId, eqly_name eqlyName FROM eq_ly WHERE eqly_id=#{eqlyId}")
	EqLy findById(@Param("eqlyId") String eqlyId);

	@Select("SELECT eqly_id eqlyId, eqly_name eqlyName FROM eq_ly WHERE eqly_name=#{eqlyName}")
	EqLy findByName(@Param("eqlyName") String eqlyName);

	@Select("SELECT eqly_id eqlyId, eqly_name eqlyName FROM eq_ly")
	List<EqLy> findAll();
	@Delete(" delete from eq_ly" +
			"    where eqly_id = #{eqlyId,jdbcType=VARCHAR}")
	int delete(String eqlyId);
	@Insert(" insert into eq_ly (eqly_id, eqly_name) values (#{eqlyId,jdbcType=VARCHAR}, #{eqlyName,jdbcType=VARCHAR})")
	int insert(EqLy eqLy);

	@Update((" update eq_ly\n" +
			"    set eqly_name = #{eqlyName,jdbcType=VARCHAR}\n" +
			"    where eqly_id = #{eqlyId,jdbcType=VARCHAR}"))
	Integer update(EqLy eqLy);
}
