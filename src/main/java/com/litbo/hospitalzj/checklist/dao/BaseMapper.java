package com.litbo.hospitalzj.checklist.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 公共的Dao层
 * @author bigStone
 *
 */

@Mapper
public interface BaseMapper {

	/**
	 * 查询设备对应的设备检测表
	 * @param tableId
	 * @return
	 */
	@Select("SELECT eq_pm.`eq_ck_tab` FROM eq_info , eq_pm WHERE eq_info.`eq_pm_id` = eq_pm.`eq_pm_id` AND eq_info.`eq_id` = #{eqId}")
	public String findTableName(String eqId);
}
