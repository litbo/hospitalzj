 package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.litbo.hospitalzj.supplier.entity.HtInfo;
import com.litbo.hospitalzj.supplier.vo.EqHtVo;

@Mapper
public interface HtInfoMapper {

	@Insert("insert into ht_info(ht_id,ht_ghsn,ht_ghslxr,ht_ghsdh,ht_hthao,ht_gzspd,ht_zhbhao,ht_bz,ht_qytime,ht_dhtime,ht_bxtime,"
			+ "ht_syks,ht_azdd,ht_ly,ht_cgfs,ht_sglb,ht_sbyt,ht_jfly,ht_file1,ht_file2,ht_file3,ht_file4,ht_file5"
			+ ",ht_state,ht_yzm,sbcs_id,ht_yssj,ht_ysbz) value "
			+ "(#{htId},#{htGhsn},#{htGhslxr},#{htGhsdh},#{htHthao},#{htGzspd},#{htZhbhao},#{htBz},#{htQytime},#{htDhtime},#{htBxtime},"
			+ "#{htSyks},#{htAzdd},#{htLy},#{htCgfs},#{htSglb},#{htSbyt},#{htJfly},#{htFile1},#{htFile2},"
			+ "#{htFile3},#{htFile4},#{htFile5},#{htState},#{htYzm},#{sbcsId},#{htYssj},#{htYsbz})")
	@Options(useGeneratedKeys = true, keyProperty = "htId", keyColumn = "ht_id")
	Integer insertHt(HtInfo htInfo);
	
	@Update("UPDATE ht_info SET ht_file1=#{htFile1} where ht_id=#{htId}")
	Integer updateOne(@Param("htId") Integer htId, @Param("htFile1") String htFile1);
	
	@Update("UPDATE ht_info SET ht_file2=#{htFile2} where ht_id=#{htId}")
	Integer updateTwo(@Param("htId") Integer htId, @Param("htFile2") String htFile2);
	
	@Update("UPDATE ht_info SET ht_file3=#{htFile3} where ht_id=#{htId}")
	Integer updateThree(@Param("htId") Integer htId, @Param("htFile3") String htFile3);
	
	@Update("UPDATE ht_info SET ht_file4=#{htFile4} where ht_id=#{htId}")
	Integer updateFour(@Param("htId") Integer htId, @Param("htFile4") String htFile4);
	
	@Update("UPDATE ht_info SET ht_file5=#{htFile5} where ht_id=#{htId}")
	Integer updateFive(@Param("htId") Integer htId, @Param("htFile5") String htFile5);

//
//	@Update("UPDATE ht_info SET ht_State=#{htState}  where ht_id=#{htId}")
//	Integer updateState(@Param("htId") Integer htId, String yy, @Param("htState") String htState);
	
/*	@Update("UPDATE ht_info SET ht_yzm=#{htYzm},ht_state=#{htState} where sbcs_id=#{sbcsId}")*/
	@Update("UPDATE ht_info SET ht_yzm=#{htYzm},ht_state=#{htState} where ht_id=#{htId}")
	Integer updateYzm(@Param("htId") Integer htId, @Param("htYzm") String htYzm, @Param("htState") Integer htState);
	
	@Update("UPDATE ht_info SET ht_ghslxr=#{htGhslxr},ht_hthao=#{htHthao},ht_ghsdh=#{htGhsdh},ht_zhbhao=#{htZhbhao},"
			+ "ht_bz=#{htBz},ht_qytime=#{htQytime},ht_dhtime=#{htDhtime},"
			+ "ht_bxtime=#{htBxtime},ht_syks=#{htSyks},ht_azdd=#{htAzdd},ht_ly=#{htLy},ht_cgfs=#{htCgfs},"
			+ "ht_sglb=#{htSglb},ht_sbyt=#{htSbyt},ht_jfly=#{htJfly},ht_jlsb=#{htJlsb},ht_fssb=#{htFssb},"
			+ "ht_file1=#{htFile1},ht_file2=#{htFile2},ht_file3=#{htFile3},ht_file4=#{htFile4},ht_file5=#{htFile5},ht_State=#{htState} "
			+ "where ht_id=#{htId}")
	HtInfo updateInfo(HtInfo htinfo);
	
	@Select("select ht_id htId,ht_ghsn htGhsn,ht_ghslxr htGhslxr,ht_ghsdh htGhsdh,ht_ghsdh htGhsdh,IFNULL(ht_hthao,'无') htHthao,IFNULL(ht_gzspd,'无') htGzspd,"
			+ "ht_zhbhao htZhbhao,ht_bz htBz,ht_qytime htQytime,ht_dhtime htDhtime,ht_bxtime htBxtime,"
			+ "ht_syks htSyks,ht_azdd htAzdd,ht_ly htLy,ht_cgfs htCgfs,ht_sglb htSglb,ht_sbyt htSbyt,"
			+ "ht_jfly htJfly,ht_file1 htFile1,ht_file2 htFile2,ht_file3 htFile3,ht_file4 htFile4,"
			+ "ht_file5 htFile5,ht_state htState,ht_yzm htYzm,sbcs_id sbcdId,ht_yssj htYssj,"
			+ "ht_ysbz htYsbz from ht_info where sbcs_id=#{sbcsId}")
	List<HtInfo> findBySbcsId(Integer sbcsId);

	@Select("select ht_id htId,ht_ghsn htGhsn,ht_ghslxr htGhslxr,ht_ghsdh htGhsdh,ht_ghsdh htGhsdh,IFNULL(ht_hthao,'无') htHthao,IFNULL(ht_gzspd,'无') htGzspd,"
			+ "ht_zhbhao htZhbhao,ht_bz htBz,ht_qytime htQytime,ht_dhtime htDhtime,ht_bxtime htBxtime,"
			+ "ht_syks htSyks,ht_azdd htAzdd,ht_ly htLy,ht_cgfs htCgfs,ht_sglb htSglb,ht_sbyt htSbyt,"
			+ "ht_jfly htJfly,ht_file1 htFile1,ht_file2 htFile2,ht_file3 htFile3,ht_file4 htFile4,"
			+ "ht_file5 htFile5,ht_state htState,ht_yzm htYzm,sbcs_id sbcdId,ht_yssj htYssj,"
			+ "ht_ysbz htYsbz from ht_info where ht_id=#{htId}")
	HtInfo findByHtId(Integer htId);
	
	@Select("select ht_id htId,ht_ghsn htGhsn,ht_ghslxr htGhslxr,ht_ghsdh htGhsdh,IFNULL(ht_hthao,'无')  htHthao,IFNULL(ht_gzspd,'无') htGzspd,ht_zhbhao htZhbhao,"
			+ "ht_bz htBz,ht_qytime htQytime,ht_dhtime htDhtime,ht_bxtime htBxtime,ht_syks htSyks,ht_azdd htAzdd,ht_ly htLy,ht_cgfs htCgfs,ht_sglb htSglb,ht_sbyt htSbyt,"
			+ "ht_jfly htJfly,ht_jlsb htJlsb,ht_fssb htFssb,ht_file1 htFile1,ht_file2 htFile2,ht_file3 htFile3,ht_file4 htFile4,ht_file5 htFile5,ht_state htState,ht_yzm htYzm,sbcs_id sbcdId,ht_yssj htYssj,ht_ysbz htYsbz from ht_info where ht_yzm=#{htYzm}")
	HtInfo findByHtYzm(@Param("htYzm") String htYzm);
	
	@Select("select ht_ids htIds,ht_hthao htHthao,eq_pm eqPm,eq_gg eqGg,eq_xh eqXh,ht_qytime htQytime,ht_state htState,ht_yzm htYzm from ht_info inner join eq_info on ht_info.ht_id=eq_info.ht_ids where ht_yzm=#{htYzm}")
	List<EqHtVo> EqHtVo(String htYzm);
	@Select("select ht_id ,ht_ghsn ,ht_ghslxr ,ht_ghsdh ,ht_ghsdh ,IFNULL(ht_hthao,'无') ht_hthao,IFNULL(ht_gzspd,'无') ht_gzspd,"
			+ "ht_zhbhao ,ht_bz ,ht_qytime ,ht_dhtime ,ht_bxtime ,"
			+ "ht_syks ,ht_azdd ,ht_ly ,ht_cgfs ,ht_sglb ,ht_sbyt ,"
			+ "ht_jfly   ,ht_file1 ,ht_file2 ,ht_file3 ,ht_file4 ,"
			+ "ht_file5 ,ht_state ,ht_yzm ,sbcs_id ,ht_yssj ,"
			+ "ht_ysbz  from ht_info where ht_state=#{state}")
    List<HtInfo> findAll(Integer state);
	@Update("UPDATE ht_info SET ht_State=#{htState},ht_bz =#{yy},ht_yssj=#{date} where ht_id=#{htId}")
	int updateState(@Param("htId") Integer htId, @Param("yy") String yy, @Param("date") String date,@Param("htState")Integer htState);

	@Update("UPDATE ht_info SET ht_State=#{htState} where ht_id=#{htId}")
	int updateStateById(@Param("htId") Integer htId,@Param("htState")Integer htState);
}
