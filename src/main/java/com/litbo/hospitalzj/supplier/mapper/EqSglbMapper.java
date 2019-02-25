package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.litbo.hospitalzj.supplier.entity.EqSglb;
/**
 * 设备申购类别持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface EqSglbMapper {
	@Select("SELECT eqsg_id eqsgId, eqsg_name eqsgName FROM eq_sglb WHERE eqsg_id=#{eqsgId}")
	EqSglb findById(@Param("eqsgId")String eqsgId);
	@Select("SELECT eqsg_id eqsgId, eqsg_name eqsgName FROM eq_sglsb")
	List<EqSglb> findAll();
}
