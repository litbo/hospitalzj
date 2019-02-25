package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.litbo.hospitalzj.supplier.entity.EqYt;
/**
 * 设备用途持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface EqYtMapper {
	@Select("SELECT eqyt_id eqytId, eqyt_name eqytName FROM eq_sbyt WHERE eqyt_id=#{eqytId}")
	EqYt findById(@Param("eqlyId")String eqlyId);
	@Select("SELECT eqyt_id eqytId, eqyt_name eqytName FROM eq_sbyt")
	List<EqYt> findAll();
}
