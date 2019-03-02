package com.litbo.hospitalzj.checklist.dao;

import com.litbo.hospitalzj.checklist.domain.Dcsjhy;
import com.litbo.hospitalzj.checklist.domain.DcsjhyTemplate;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


/**
 * 多参数监护仪dao层
 * @author bigStone
 *
 */
@Mapper
public interface DcsjhyMapper {

	//查询多参数监护仪模板表
	@Select("select dc_templateid, xl_test1, xl_test2, xl_test3, xl_test4, xl_test5, xl_wc, hxl_test1,"
			+"hxl_test2, hxl_test3, hxl_test4, hxl_test5, hxl_wc, xybhd_test1, xybhd_test2, xybhd_test3,"
			+"xybhd_test4, xybhd_test5, xybhd_wc, wcxy_test1, wcxy_test2, wcxy_test3, wcxy_test4, "
			+"wcxy_test5, wcxy_wc, wcxyjt_sd, wcxyjt_wc, wcxyqm_sd, wcxyqm_xll_wc from dcsjhy_template order by dc_templateid desc limit 1")
	public DcsjhyTemplate findTemplate();

	//保存多参数监护仪检测表
	@Insert("insert into dcsjhy (dcid, jcyq_id, eq_id,tester, auditor, test_time, jcjl, jcsm, xl_test1,                         "
			+"xl_test2, xl_test3, xl_test4, xl_test5, xl_value1, xl_value2,  xl_value3, xl_value4, xl_value5,                         "
			+"xl_wc, xl_result, hxl_test1,  hxl_test2, hxl_test3, hxl_test4, hxl_test5, hxl_value1, hxl_value2,                       "
			+"hxl_value3, hxl_value4, hxl_value5, hxl_wc, hxl_result, xybhd_test1,xybhd_test2, xybhd_test3, xybhd_test4,              "
			+"xybhd_test5, xybhd_value1, xybhd_value2, xybhd_value3, xybhd_value4, xybhd_value5,                                      "
			+"xybhd_wc, xybhd_result, wcxy_h_test1, wcxy_m_test1, wcxy_l_test1, wcxy_h_test2,                                         "
			+"wcxy_m_test2, wcxy_l_test2, wcxy_h_test3, wcxy_m_test3, wcxy_l_test3, wcxy_h_test4,                                     "
			+"wcxy_m_test4, wcxy_l_test4, wcxy_h_test5, wcxy_m_test5, wcxy_l_test5, wcxy_h_value11,                                   "
			+"wcxy_m_value11, wcxy_l_value11, wcxy_h_value12, wcxy_m_value12, wcxy_l_value12, wcxy_h_value13,                         "
			+"wcxy_m_value13, wcxy_l_value13, wcxy_h_value14, wcxy_m_value14, wcxy_l_value14, wcxy_h_value15,                         "
			+"wcxy_m_value15, wcxy_l_value15, wcxy_h_value21,  wcxy_m_value21, wcxy_l_value21, wcxy_h_value22,                        "
			+"wcxy_m_value22, wcxy_l_value22, wcxy_h_value23,  wcxy_m_value23, wcxy_l_value23, wcxy_h_value24,                        "
			+"wcxy_m_value24, wcxy_l_value24, wcxy_h_value25,  wcxy_m_value25, wcxy_l_value25, wcxy_h_value31,                        "
			+"wcxy_m_value31, wcxy_l_value31, wcxy_h_value32, wcxy_m_value32, wcxy_l_value32, wcxy_h_value33,                         "
			+"wcxy_m_value33, wcxy_l_value33, wcxy_h_value34, wcxy_m_value34, wcxy_l_value34, wcxy_h_value35,                         "
			+"wcxy_m_value35, wcxy_l_value35, wcxy_wc, wcxy_result, wcxyjt_sd, wcxyjt_mnq, wcxyjt_jhy, wcxyjt_wc, wcxyjt_result,      "
			+"wcxyqm_sd, wcxyqm_xll, wcxyqm_wc,  wcxyqm_result, sgbj_result, bjxjc_result, jyjc_result, spare1, spare2,  spare3)      "
			+"values (#{dcid,jdbcType=INTEGER}, #{jcyqId,jdbcType=INTEGER}, #{eqId,jdbcType=INTEGER},                                 "
			+"#{tester,jdbcType=VARCHAR}, #{auditor,jdbcType=VARCHAR}, #{testTime,jdbcType=TIMESTAMP},                                "
			+"#{jcjl,jdbcType=VARCHAR}, #{jcsm,jdbcType=VARCHAR}, #{xlTest1,jdbcType=INTEGER},                                        "
			+"#{xlTest2,jdbcType=INTEGER}, #{xlTest3,jdbcType=INTEGER}, #{xlTest4,jdbcType=INTEGER},                                  "
			+"#{xlTest5,jdbcType=INTEGER}, #{xlValue1,jdbcType=INTEGER}, #{xlValue2,jdbcType=INTEGER},                                "
			+"#{xlValue3,jdbcType=INTEGER}, #{xlValue4,jdbcType=INTEGER}, #{xlValue5,jdbcType=INTEGER},                               "
			+"#{xlWc,jdbcType=INTEGER}, #{xlResult,jdbcType=TINYINT}, #{hxlTest1,jdbcType=INTEGER},                                   "
			+"#{hxlTest2,jdbcType=INTEGER}, #{hxlTest3,jdbcType=INTEGER}, #{hxlTest4,jdbcType=INTEGER},                               "
			+"#{hxlTest5,jdbcType=INTEGER}, #{hxlValue1,jdbcType=INTEGER}, #{hxlValue2,jdbcType=INTEGER},                             "
			+"#{hxlValue3,jdbcType=INTEGER}, #{hxlValue4,jdbcType=INTEGER}, #{hxlValue5,jdbcType=INTEGER},                            "
			+"#{hxlWc,jdbcType=INTEGER}, #{hxlResult,jdbcType=TINYINT}, #{xybhdTest1,jdbcType=INTEGER},                               "
			+"#{xybhdTest2,jdbcType=INTEGER}, #{xybhdTest3,jdbcType=INTEGER}, #{xybhdTest4,jdbcType=INTEGER},                         "
			+"#{xybhdTest5,jdbcType=INTEGER}, #{xybhdValue1,jdbcType=INTEGER}, #{xybhdValue2,jdbcType=INTEGER},                       "
			+"#{xybhdValue3,jdbcType=INTEGER}, #{xybhdValue4,jdbcType=INTEGER}, #{xybhdValue5,jdbcType=INTEGER},                      "
			+"#{xybhdWc,jdbcType=INTEGER}, #{xybhdResult,jdbcType=TINYINT}, #{wcxyHTest1,jdbcType=INTEGER},                           "
			+"#{wcxyMTest1,jdbcType=INTEGER}, #{wcxyLTest1,jdbcType=INTEGER}, #{wcxyHTest2,jdbcType=INTEGER},                         "
			+"#{wcxyMTest2,jdbcType=INTEGER}, #{wcxyLTest2,jdbcType=INTEGER}, #{wcxyHTest3,jdbcType=INTEGER},                         "
			+"#{wcxyMTest3,jdbcType=INTEGER}, #{wcxyLTest3,jdbcType=INTEGER}, #{wcxyHTest4,jdbcType=INTEGER},                         "
			+"#{wcxyMTest4,jdbcType=INTEGER}, #{wcxyLTest4,jdbcType=INTEGER}, #{wcxyHTest5,jdbcType=INTEGER},                         "
			+"#{wcxyMTest5,jdbcType=INTEGER}, #{wcxyLTest5,jdbcType=INTEGER}, #{wcxyHValue11,jdbcType=INTEGER},                       "
			+"#{wcxyMValue11,jdbcType=INTEGER}, #{wcxyLValue11,jdbcType=INTEGER}, #{wcxyHValue12,jdbcType=INTEGER},                   "
			+"#{wcxyMValue12,jdbcType=INTEGER}, #{wcxyLValue12,jdbcType=INTEGER}, #{wcxyHValue13,jdbcType=INTEGER},                   "
			+"#{wcxyMValue13,jdbcType=INTEGER}, #{wcxyLValue13,jdbcType=INTEGER}, #{wcxyHValue14,jdbcType=INTEGER},                   "
			+"#{wcxyMValue14,jdbcType=INTEGER}, #{wcxyLValue14,jdbcType=INTEGER}, #{wcxyHValue15,jdbcType=INTEGER},                   "
			+"#{wcxyMValue15,jdbcType=INTEGER}, #{wcxyLValue15,jdbcType=INTEGER}, #{wcxyHValue21,jdbcType=INTEGER},                   "
			+"#{wcxyMValue21,jdbcType=INTEGER}, #{wcxyLValue21,jdbcType=INTEGER}, #{wcxyHValue22,jdbcType=INTEGER},                   "
			+"#{wcxyMValue22,jdbcType=INTEGER}, #{wcxyLValue22,jdbcType=INTEGER}, #{wcxyHValue23,jdbcType=INTEGER},                   "
			+"#{wcxyMValue23,jdbcType=INTEGER}, #{wcxyLValue23,jdbcType=INTEGER}, #{wcxyHValue24,jdbcType=INTEGER},                   "
			+"#{wcxyMValue24,jdbcType=INTEGER}, #{wcxyLValue24,jdbcType=INTEGER}, #{wcxyHValue25,jdbcType=INTEGER},                   "
			+"#{wcxyMValue25,jdbcType=INTEGER}, #{wcxyLValue25,jdbcType=INTEGER}, #{wcxyHValue31,jdbcType=INTEGER},                   "
			+"#{wcxyMValue31,jdbcType=INTEGER}, #{wcxyLValue31,jdbcType=INTEGER}, #{wcxyHValue32,jdbcType=INTEGER},                   "
			+"#{wcxyMValue32,jdbcType=INTEGER}, #{wcxyLValue32,jdbcType=INTEGER}, #{wcxyHValue33,jdbcType=INTEGER},                   "
			+"#{wcxyMValue33,jdbcType=INTEGER}, #{wcxyLValue33,jdbcType=INTEGER}, #{wcxyHValue34,jdbcType=INTEGER},                   "
			+"#{wcxyMValue34,jdbcType=INTEGER}, #{wcxyLValue34,jdbcType=INTEGER}, #{wcxyHValue35,jdbcType=INTEGER},                   "
			+"#{wcxyMValue35,jdbcType=INTEGER}, #{wcxyLValue35,jdbcType=INTEGER}, #{wcxyWc,jdbcType=INTEGER},                         "
			+"#{wcxyResult,jdbcType=TINYINT}, #{wcxyjtSd,jdbcType=INTEGER}, #{wcxyjtMnq,jdbcType=INTEGER},                            "
			+"#{wcxyjtJhy,jdbcType=INTEGER}, #{wcxyjtWc,jdbcType=INTEGER}, #{wcxyjtResult,jdbcType=TINYINT},                          "
			+"#{wcxyqmSd,jdbcType=INTEGER}, #{wcxyqmXll,jdbcType=INTEGER}, #{wcxyqmWc,jdbcType=INTEGER},                              "
			+"#{wcxyqmResult,jdbcType=TINYINT}, #{sgbjResult,jdbcType=TINYINT}, #{bjxjcResult,jdbcType=TINYINT},                      "
			+"#{jyjcResult,jdbcType=TINYINT}, #{spare1,jdbcType=VARCHAR}, #{spare2,jdbcType=VARCHAR},                                 "
			+"#{spare3,jdbcType=VARCHAR})")
	public void save(Dcsjhy dcsjhy);

	//根据设备id查询多参数监护仪的id
	@Select("select dcid as Dcid, jcyq_id as  jcyqId, eq_id as  eqId, tester as  tester, auditor as  auditor, test_time as  testTime, jcjl as  jcjl, jcsm as  jcsm, xl_test1 as  xlTest1, xl_test2 as  xlTest2,xl_test3 as xlTest3, xl_test4 as  xlTest4, xl_test5 as  xlTest5, xl_value1 as  xlValue1, xl_value2 as  xlValue2, xl_value3 as  xlValue3, xl_value4 as  xlValue4, xl_value5 as  xlValue5,xl_wc as xlWc, xl_result as  xlResult, hxl_test1 as  hxlTest1, hxl_test2 as  hxlTest2, hxl_test3 as  hxlTest3, hxl_test4 as  hxlTest4, hxl_test5 as  hxlTest5, hxl_value1 as  hxlValue1,hxl_value2 as hxlValue2, hxl_value3 as  hxlValue3, hxl_value4 as  hxlValue4, hxl_value5 as  hxlValue5, hxl_wc as  hxlWc, hxl_result as  hxlResult, xybhd_test1 as  xybhdTest1,xybhd_test2 as xybhdTest2, xybhd_test3 as  xybhdTest3, xybhd_test4 as  xybhdTest4, xybhd_test5 as  xybhdTest5, xybhd_value1 as  xybhdValue1, xybhd_value2 as  xybhdValue2,"
			+ "xybhd_value3 as  xybhdValue3,xybhd_value4 as xybhdValue4, xybhd_value5 as  xybhdValue5, xybhd_wc as  xybhdWc, xybhd_result as  xybhdResult, wcxy_h_test1 as  wcxyHTest1, wcxy_m_test1 as  wcxyMTest1, wcxy_l_test1 as  wcxyLTest1,wcxy_h_test2 as wcxyHTest2, wcxy_m_test2 as  wcxyMTest2, wcxy_l_test2 as  wcxyLTest2, wcxy_h_test3 as  wcxyHTest3, wcxy_m_test3 as  wcxyMTest3, wcxy_l_test3 as  wcxyLTest3,wcxy_h_test4 as wcxyHTest4, wcxy_m_test4 as  wcxyMTest4, wcxy_l_test4 as  wcxyLTest4, wcxy_h_test5 as  wcxyHTest5, wcxy_m_test5 as  wcxyMTest5, wcxy_l_test5 as  wcxyLTest5,wcxy_h_value11 as wcxyHValue11, wcxy_m_value11 as  wcxyMValue11, wcxy_l_value11 as  wcxyLValue11, wcxy_h_value12 as  wcxyHValue12, wcxy_m_value12 as  wcxyMValue12, wcxy_l_value12 as  wcxyLValue12,wcxy_h_value13 as wcxyHValue13, wcxy_m_value13 as  wcxyMValue13, wcxy_l_value13 as  wcxyLValue13, wcxy_h_value14 as  wcxyHValue14, "
			+ "wcxy_m_value14 as  wcxyMValue14, wcxy_l_value14 as  wcxyLValue14,wcxy_h_value15 as wcxyHValue15, wcxy_m_value15 as  wcxyMValue15, wcxy_l_value15 as  wcxyLValue15, wcxy_h_value21 as  wcxyHValue21, wcxy_m_value21 as  wcxyMValue21, wcxy_l_value21 as  wcxyLValue21,wcxy_h_value22 as wcxyHValue22, wcxy_m_value22 as  wcxyMValue22, wcxy_l_value22 as  wcxyLValue22, wcxy_h_value23 as  wcxyHValue23, wcxy_m_value23 as  wcxyMValue23, wcxy_l_value23 as  wcxyLValue23,wcxy_h_value24 as wcxyHValue24, wcxy_m_value24 as  wcxyMValue24, wcxy_l_value24 as  wcxyLValue24, wcxy_h_value25 as  wcxyHValue25, wcxy_m_value25 as  wcxyMValue25, wcxy_l_value25 as  wcxyLValue25,wcxy_h_value31 as wcxyHValue31, wcxy_m_value31 as  wcxyMValue31,"
			+ "wcxy_l_value31 as  wcxyLValue31, wcxy_h_value32 as  wcxyHValue32, wcxy_m_value32 as  wcxyMValue32, wcxy_l_value32 as  wcxyLValue32,wcxy_h_value33 as wcxyHValue33, wcxy_m_value33 as  wcxyMValue33, wcxy_l_value33 as  wcxyLValue33, wcxy_h_value34 as  wcxyHValue34, wcxy_m_value34 as  wcxyMValue34, wcxy_l_value34 as  wcxyLValue34,wcxy_h_value35 as wcxyHValue35, wcxy_m_value35 as  wcxyMValue35, wcxy_l_value35 as  wcxyLValue35, wcxy_wc as  wcxyWc, wcxy_result as  wcxyResult, wcxyjt_sd as  wcxyjtSd,wcxyjt_mnq as wcxyjtMnq, wcxyjt_jhy as  wcxyjtJhy, wcxyjt_wc as  wcxyjtWc, wcxyjt_result as  wcxyjtResult, wcxyqm_sd as  wcxyqmSd, wcxyqm_xll as  wcxyqmXll, wcxyqm_wc as  wcxyqmWc,wcxyqm_result as wcxyqmResult, sgbj_result as  sgbjResult, bjxjc_result as  bjxjcResult, jyjc_result as  jyjcResult, spare1 as  spare1, spare2 as  spare2, spare3 as  spare3 "
			+ "from Dcsjhy order by dcid desc limit 1")
	public Dcsjhy findDcsjhy(String eqId);

}