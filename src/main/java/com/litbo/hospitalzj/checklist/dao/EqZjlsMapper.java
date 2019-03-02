package com.litbo.hospitalzj.checklist.dao;

import com.litbo.hospitalzj.checklist.domain.EqZjls;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * 设备质检流水
 * @author bigStone
 *
 */
@Mapper
public interface EqZjlsMapper {

	
	//插入设备质检流水
	@Insert("insert into eq_zjls (dz_id, test_time, eq_id, tester, auditor)values (#{dzId,jdbcType=INTEGER},"
			+ " #{testTime,jdbcType=TIMESTAMP}, #{eqId,jdbcType=INTEGER},#{tester,jdbcType=VARCHAR}, #{auditor,jdbcType=VARCHAR})")
	void save(EqZjls eqZjls);


}
