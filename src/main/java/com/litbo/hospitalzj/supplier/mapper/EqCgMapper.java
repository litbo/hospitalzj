package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.litbo.hospitalzj.supplier.entity.EqCgfs;
/**
 * 采购持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface EqCgMapper {
	@Select("SELECT eqcg_id eqcgId, eqcg_name eqcgName FROM eq_cgfs WHERE eqcg_id=#{eqcgId}")
	EqCgfs findById(@Param("eqcgId") String eqcgId);

	@Select("SELECT eqcg_id eqcgId, eqcg_name eqcgName FROM eq_cgfs WHERE eqcg_name=#{eqcgName}")
	EqCgfs findByName(@Param("eqcgName") String eqcgName);

	@Select("SELECT eqcg_id eqcgId, eqcg_name eqcgName FROM eq_cgfs")
	List<EqCgfs> findAll();

	@Delete("delete from eq_cgfs where eqcg_id = #{eqcgId,jdbcType=VARCHAR}")
	int delete(String eqcgId);

	@Insert("insert into eq_cgfs (eqcg_id, eqcg_name) values (#{eqcgId}, #{eqcgName})")
	int insert(EqCgfs eqCgfs);
	@Update(" update eq_cgfs\n" +
			"    set eqcg_name = #{eqcgName,jdbcType=VARCHAR}\n" +
			"    where eqcg_id = #{eqcgId,jdbcType=VARCHAR}")
	Integer update(EqCgfs eqCgfs);
}
