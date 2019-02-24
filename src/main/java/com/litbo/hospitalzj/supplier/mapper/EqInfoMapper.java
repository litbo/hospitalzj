package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.litbo.hospitalzj.supplier.entity.EqInfo;
import com.litbo.hospitalzj.supplier.vo.EqHtVo;
import com.litbo.hospitalzj.supplier.vo.SelHtEqVo;

import junit.framework.Test;

@Mapper
public interface EqInfoMapper {
	/*@Insert({
		 "<script>",
		 "insert into eq_Info (eq_id,ht_ids,eq_pm,eq_gg,"
		 + "eq_xh,eq_jldw_id,eq_price,eq_zczbh,eq_scbh,eq_num,eq_totalprice,"
		 + "eq_ccdate,eq_cscs,eq_gb,eq_bgbh,eq_sh_fws,eq_sh_qddh,eq_sh_shjl,"
		 + "eq_sh_jldh,eq_sh_fwr,eq_sh_lxr,eq_sh_lxrdh,eq_state,eq_yzm,"
		 + "eq_sh_jlsb,eq_sh_fssb) values ",
		 "<foreach collection='eqInfos' item='item' index='index' separator=','>",
		 "(#{item.eqId},#{item.htIds},#{item.eqPm},#{item.eqGg},#{item.eqXh},#{item.eqJldwId},#{item.eqPrice},#{item.eqZczbh},"
		 + "#{item.eqScbh},#{item.eqNum},#{item.eqTotalprice},#{item.eqCcdate},"
		 + "#{item.eqCscs},#{item.eqGb},#{item.eqBgbh},#{item.eqShFws},#{item.eqShQddh},"
		 + "#{item.eqShShjl},#{item.eqShJldh},#{item.eqShFwr},"
		 + "#{item.eqShLxr},#{item.eqShLxrdh},#{item.eqState},#{item.eqYzm},#{item.eqShFssb},"
		 + "#{item.eqShFssb})",
		 "</foreach>",
		 "</script>"
		})
		int insertEqInfoList(@Param(value="eqInfos") List<EqInfo>  eqInfo);*/
	
	@Insert ("insert into eq_Info (eq_id,ht_ids,eq_pm,eq_gg,eq_xh,eq_jldw_id,"
			+ "eq_price,eq_zczbh,eq_scbh,eq_num,eq_totalprice,"
			+ "eq_ccdate,eq_cscs,eq_gb,eq_bgbh,eq_sh_fws,eq_sh_qddh,"
			+ "eq_sh_shjl,eq_sh_jldh,eq_sh_fwr,eq_sh_lxr,eq_sh_lxrdh,eq_state,eq_yzm,eq_sh_jlsb,eq_sh_fssb) value "
			+ "(#{eqId},#{htIds},#{eqPm},#{eqGg},#{eqXh},#{eqJldwId},#{eqPrice},#{eqZczbh},"
			+ "#{eqScbh},#{eqNum},#{eqTotalprice},#{eqCcdate},"
			+ "#{eqCscs},#{eqGb},#{eqBgbh},#{eqShFws},#{eqShQddh},"
			+ "#{eqShShjl},#{eqShJldh},#{eqShFwr},"
			+ "#{eqShLxr},#{eqShLxrdh},#{eqState},#{eqYzm},#{eqShJlsb},#{eqShFssb})")
	@Options(useGeneratedKeys = true, keyProperty = "eqId", keyColumn = "eq_id")
	Integer insertEqInfo(EqInfo eqInfo);
	
	@Select("select eq_id eqId,ht_ids htIds,eq_pm eqPm,eq_gg eqGg,eq_xh eqXh,eq_jldw_id eqJlDwId,eq_price eqPrice,eq_zczbh eqZczbh,eq_scbh eqScbh,eq_num eqNum,eq_totalprice eqTotalprice,eq_ccdate eqCcdate,eq_cscs eqCscs,eq_gb eqGb,eq_bgbh eqBgbh,eq_sh_fws eqShFws,eq_sh_qddh eqShQddh,eq_sh_shjl eqShShjl,eq_sh_jldh eqShJldh,eq_sh_fwr eqShFwr,eq_sh_lxr eqShLxr,eq_sh_lxrdh eqShLxrdh,eq_state eqState,eq_yzm eqYzm,eq_sh_jlsb eqShJlsb,eq_sh_fssb eqShFssb from eq_info where ht_ids=#{htIds}")
	List<EqInfo> selectEqinfo(Integer htIds);
	
	@Select("select ht_ids htIds from eq_info where eq_id=#{eqId}")
	Integer selectHtId(Integer eqId);
	@Select("select IFNULL(ht_hthao,'无') htHthao,IFNULL(ht_gzspd,'无') htGzspd,eq_id eqId,ht_ids htIds,eq_pm eqPm,eq_gg eqGg,eq_xh eqXh,eq_jldw_id eqJlDwId,eq_price eqPrice,eq_zczbh eqZczbh,eq_scbh eqScbh,eq_num eqNum,eq_totalprice eqTotalprice,eq_ccdate eqCcdate,eq_cscs eqCscs,eq_gb eqGb,eq_bgbh eqBgbh,eq_sh_fws eqShFws,eq_sh_qddh eqShQddh,eq_sh_shjl eqShShjl,eq_sh_jldh eqShJldh,eq_sh_fwr eqShFwr,eq_sh_lxr eqShLxr,eq_sh_lxrdh eqShLxrdh,eq_state eqState,eq_yzm eqYzm,eq_sh_jlsb eqShJlsb,"
			+ "eq_sh_fssb eqShFssb from eq_info e left join ht_info h on e.ht_ids=h.ht_id where ht_ids=#{htIds}")
	List<SelHtEqVo> selectEqHtVo(Integer htIds);
	@Update("update eq_Info set eq_gg=#{eqGg},eq_xh=#{eqXh},eq_jldw_id=#{eqJldwId},"
			+ "eq_price=#{eqPrice},eq_zczbh=#{eqZczbh},eq_scbh=#{eqScbh},eq_num=#{eqNum},"
			+ "eq_totalprice=#{eqTotalprice},eq_ccdate=#{eqCcdate},eq_cscs=#{eqCscs},eq_gb=#{eqGb},"
			+ "eq_bgbh=#{eqBgbh},eq_sh_fws=#{eqShFws},eq_sh_qddh=#{eqShQddh},"
			+ "eq_sh_shjl=#{eqShShjl},eq_sh_jldh=#{eqShJldh},eq_sh_fwr=#{eqShFwr},"
			+ "eq_sh_lxr=#{eqShLxr},eq_sh_lxrdh=#{eqShLxrdh},"
			+ "eq_sh_jlsb=#{eqShJlsb},eq_sh_fssb=#{eqShFssb} where eq_id=#{eqId}")
	Integer updateInfo(EqInfo eqinfo);
	
}
