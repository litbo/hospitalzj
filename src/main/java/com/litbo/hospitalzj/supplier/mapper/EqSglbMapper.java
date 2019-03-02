package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import com.litbo.hospitalzj.supplier.entity.EqSglb;
/**
 * 设备申购类别持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface EqSglbMapper {
	@Select("SELECT eqsg_id eqsgId, eqsg_name eqsgName FROM eq_sglb WHERE eqsg_id=#{eqsgId}")
	EqSglb findById(@Param("eqsgId") String eqsgId);

	@Select("SELECT eqsg_id eqsgId, eqsg_name eqsgName FROM eq_sglb")
	List<EqSglb> findAll();

	@Delete("delete from eq_sglb\n" +
			"    where eqsg_id = #{eqsgId,jdbcType=VARCHAR}")
	int delete(String eqsgId);

	@Insert(" insert into eq_sglb (eqsg_id, eqsg_name) values (#{eqsgId,jdbcType=VARCHAR}, #{eqsgName,jdbcType=VARCHAR})")
	int insert(EqSglb eqSglb);

	@Update(" update eq_sglb\n" +
			"    set eqsg_name = #{eqsgName,jdbcType=VARCHAR}\n" +
			"    where eqsg_id = #{eqsgId,jdbcType=VARCHAR}")
	Integer update(EqSglb eqSglb);
}
