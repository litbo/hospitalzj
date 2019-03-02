package com.litbo.hospitalzj.checklist.dao;

import com.litbo.hospitalzj.checklist.domain.Dqjc;
import com.litbo.hospitalzj.checklist.domain.DqjcTemplate;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


/**
 * 电器检测dao层
 * @author bigStone
 *
 */
@Mapper
public interface DqjcMapper {
	
    //查询电气检测模板表
	@Select("select dqjc_templateid, dydy, jdzk, jyzk, ddldl_zc, ddldl_dy, wkldl_zc, wkldl_dy, hzldl_zc_bf, hzldl_zc_cf, hzldl_dy_bf, hzldl_dy_cf,"
			+ " hzfzldl_zc_bf, hzfzldl_zc_cf, hzfzldl_dy_bf, hzfzldl_dy_cf from dqjc_template order by dqjc_templateid desc limit 1")
	public DqjcTemplate findTemplate();

	//保存电气检测数据
	@Insert("insert into dqjc (dqjcid, jcyq_id, eq_id, tester, auditor, test_time, jcjl, jcsm, dydy, dydy_value,  dydy_result, jdzk, jdzk_value, "
      +"jdzk_result, jyzk, jyzk_value,  jyzk_result, ddldl_zc, ddldl_zc_zx_value,  ddldl_zc_fx_value, ddldl_zc_result, ddldl_dy,                 "
      +"ddldl_dy_zxdl_value, ddldl_dy_fxdl_value, ddldl_dy_result,  wkldl_zc, wkldl_zc_zx_value, wkldl_zc_fx_value,                              "
      +"wkldl_zc_result, wkldl_dy, wkldl_dy_zxdl_value,  wkldl_dy_zxdd_value, wkldl_dy_fxdl_value, wkldl_dy_fxdd_value,                          "
      +"wkldl_dy_result, hzldl_zc_bf, hzldl_zc_cf, hzldl_zc_zx_value, hzldl_zc_fx_value, hzldl_zc_result,                                        "
      +"hzldl_dy_bf, hzldl_dy_cf, hzldl_dy_zxdl_value, hzldl_dy_zxdd_value, hzldl_dy_fxdl_value, hzldl_dy_fxdd_value,                            "
      +"hzldl_dy_result, hzfzldl_zc_bf, hzfzldl_zc_cf,  hzfzldl_zc_zx_value, hzfzldl_zc_fx_value, hzfzldl_zc_result,                             "
      +"hzfzldl_dy_bf, hzfzldl_dy_cf, hzfzldl_dy_zxdl_value,  hzfzldl_dy_zxdd_value, hzfzldl_dy_fxdl_value, hzfzldl_dy_fxdd_value,               "
      +"hzfzldl_dy_result, spare1, spare2,  spare3, spare4, spare5)                                                                              "
      +"values (#{dqjcid,jdbcType=INTEGER}, #{jcyqId,jdbcType=INTEGER}, #{eqId,jdbcType=INTEGER}, "                                                                                                                                 
      +"#{tester,jdbcType=VARCHAR}, #{auditor,jdbcType=VARCHAR}, #{testTime,jdbcType=TIMESTAMP},  #{jcjl,jdbcType=VARCHAR}, #{jcsm,jdbcType=VARCHAR}, #{dydy,jdbcType=DOUBLE}, #{dydyValue,jdbcType=DOUBLE},                        "
      +"#{dydyResult,jdbcType=TINYINT}, #{jdzk,jdbcType=DOUBLE}, #{jdzkValue,jdbcType=DOUBLE},  #{jdzkResult,jdbcType=TINYINT}, #{jyzk,jdbcType=DOUBLE}, #{jyzkValue,jdbcType=DOUBLE},                                              "
      +"#{jyzkResult,jdbcType=TINYINT}, #{ddldlZc,jdbcType=DOUBLE}, #{ddldlZcZxValue,jdbcType=DOUBLE},  #{ddldlZcFxValue,jdbcType=DOUBLE}, #{ddldlZcResult,jdbcType=TINYINT}, #{ddldlDy,jdbcType=DOUBLE},                           "
      +"#{ddldlDyZxdlValue,jdbcType=DOUBLE}, #{ddldlDyFxdlValue,jdbcType=DOUBLE}, #{ddldlDyResult,jdbcType=TINYINT},  #{wkldlZc,jdbcType=DOUBLE}, #{wkldlZcZxValue,jdbcType=DOUBLE}, #{wkldlZcFxValue,jdbcType=DOUBLE},             "
      +"#{wkldlZcResult,jdbcType=TINYINT}, #{wkldlDy,jdbcType=DOUBLE}, #{wkldlDyZxdlValue,jdbcType=DOUBLE},  #{wkldlDyZxddValue,jdbcType=DOUBLE}, #{wkldlDyFxdlValue,jdbcType=DOUBLE}, #{wkldlDyFxddValue,jdbcType=DOUBLE},         "
      +"#{wkldlDyResult,jdbcType=TINYINT}, #{hzldlZcBf,jdbcType=DOUBLE}, #{hzldlZcCf,jdbcType=DOUBLE},  #{hzldlZcZxValue,jdbcType=DOUBLE}, #{hzldlZcFxValue,jdbcType=DOUBLE}, #{hzldlZcResult,jdbcType=TINYINT},                    "
      +"#{hzldlDyBf,jdbcType=DOUBLE}, #{hzldlDyCf,jdbcType=DOUBLE}, #{hzldlDyZxdlValue,jdbcType=DOUBLE},   #{hzldlDyZxddValue,jdbcType=DOUBLE}, #{hzldlDyFxdlValue,jdbcType=DOUBLE}, #{hzldlDyFxddValue,jdbcType=DOUBLE},           "
      +"#{hzldlDyResult,jdbcType=TINYINT}, #{hzfzldlZcBf,jdbcType=DOUBLE}, #{hzfzldlZcCf,jdbcType=DOUBLE},  #{hzfzldlZcZxValue,jdbcType=DOUBLE}, #{hzfzldlZcFxValue,jdbcType=DOUBLE}, #{hzfzldlZcResult,jdbcType=TINYINT},          "
      +"#{hzfzldlDyBf,jdbcType=DOUBLE}, #{hzfzldlDyCf,jdbcType=DOUBLE}, #{hzfzldlDyZxdlValue,jdbcType=DOUBLE},  #{hzfzldlDyZxddValue,jdbcType=DOUBLE}, #{hzfzldlDyFxdlValue,jdbcType=DOUBLE}, #{hzfzldlDyFxddValue,jdbcType=DOUBLE},"
      +"#{hzfzldlDyResult,jdbcType=TINYINT}, #{spare1,jdbcType=TINYINT}, #{spare2,jdbcType=TINYINT},  #{spare3,jdbcType=TINYINT}, #{spare4,jdbcType=TINYINT}, #{spare5,jdbcType=TINYINT})")
	public void save(Dqjc dqjc);

	//根据电气检测设备id查询设备检测表
	@Select("select dqjcid, jcyq_id, eq_id, tester, auditor, test_time, jcjl, jcsm, dydy, dydy_value, "
    +"dydy_result, jdzk, jdzk_value, jdzk_result, jyzk, jyzk_value, jyzk_result, ddldl_zc,            "
    +"ddldl_zc_zx_value, ddldl_zc_fx_value, ddldl_zc_result, ddldl_dy, ddldl_dy_zxdl_value,           "
    +"ddldl_dy_fxdl_value, ddldl_dy_result, wkldl_zc, wkldl_zc_zx_value, wkldl_zc_fx_value,           "
    +"wkldl_zc_result, wkldl_dy, wkldl_dy_zxdl_value, wkldl_dy_zxdd_value, wkldl_dy_fxdl_value,       "
    +"wkldl_dy_fxdd_value, wkldl_dy_result, hzldl_zc_bf, hzldl_zc_cf, hzldl_zc_zx_value,              "
    +"hzldl_zc_fx_value, hzldl_zc_result, hzldl_dy_bf, hzldl_dy_cf, hzldl_dy_zxdl_value,              "
    +"hzldl_dy_zxdd_value, hzldl_dy_fxdl_value, hzldl_dy_fxdd_value, hzldl_dy_result, hzfzldl_zc_bf,  "
    +"hzfzldl_zc_cf, hzfzldl_zc_zx_value, hzfzldl_zc_fx_value, hzfzldl_zc_result, hzfzldl_dy_bf,      "
    +"hzfzldl_dy_cf, hzfzldl_dy_zxdl_value, hzfzldl_dy_zxdd_value, hzfzldl_dy_fxdl_value,             "
    +"hzfzldl_dy_fxdd_value, hzfzldl_dy_result, spare1, spare2, spare3, spare4, spare5 from dqjc order by dqjcid desc limit 1 where eq_id = '#{eqId}'")
	public Dqjc findDqjc(String eqId);

	
	
}