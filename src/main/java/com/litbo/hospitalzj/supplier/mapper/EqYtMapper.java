package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import com.litbo.hospitalzj.supplier.entity.EqPm;
import org.apache.ibatis.annotations.*;
import com.litbo.hospitalzj.supplier.entity.EqYt;
/**
 * 设备用途持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface EqYtMapper {
	@Select("SELECT eqyt_id eqytId, eqyt_name eqytName FROM eq_sbyt WHERE eqyt_id=#{eqytId}")
	EqYt findById(@Param("eqytId")String eqytId);
	@Select("SELECT eqyt_id eqytId, eqyt_name eqytName FROM eq_sbyt")
	List<EqYt> findAll();
	@Delete(" delete from eq_sbyt\n" +
			"    where eqyt_id = #{eqytId,jdbcType=VARCHAR}")
	int delete(String eqytId);
	@Insert(" insert into eq_sbyt (eqyt_id, eqyt_name)\n" +
			"    values (#{eqytId,jdbcType=VARCHAR}, #{eqytName,jdbcType=VARCHAR})")
	int insert(EqYt eqYt);
	@Update(("   update eq_sbyt\n" +
			"    set eqyt_name = #{eqytName,jdbcType=VARCHAR}\n" +
			"    where eqyt_id = #{eqytId,jdbcType=VARCHAR}"))
	Integer update(EqYt eqYt);
}
