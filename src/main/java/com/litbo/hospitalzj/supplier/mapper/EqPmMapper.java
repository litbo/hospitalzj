package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqLy;
import org.apache.ibatis.annotations.*;

import com.litbo.hospitalzj.supplier.entity.EqPm;
/**
 * 设备品名持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface EqPmMapper {
	@Select("SELECT eq_pm_id eqPmId,eq_pm_name eqPmName FROM eq_pm WHERE eq_pm_id=#{eqPmId}")
	EqPm findById(@Param("eqPmId")String eqPmsd);
	@Select("SELECT eq_pm_id eqPmId,eq_pm_name eqPmId FROM eq_pm")
	List<EqPm> findAll();
	@Delete("delete from eq_pm\n" +
			"    where eq_pm_id = #{eqPmId,jdbcType=VARCHAR}")
	int delete(String eqPmId);
	@Insert("insert into eq_pm (eq_pm_id, eq_pm_name)\n" +
			"    values (#{eqPmId,jdbcType=VARCHAR}, #{eqPmName,jdbcType=VARCHAR})")
	int insert(EqPm eqPm);
	@Update(("  update eq_pm\n" +
			"    set eq_pm_name = #{eqPmName,jdbcType=VARCHAR}\n" +
			"    where eq_pm_id = #{eqPmId,jdbcType=VARCHAR}"))
	Integer update(EqPm eqPm);
}
