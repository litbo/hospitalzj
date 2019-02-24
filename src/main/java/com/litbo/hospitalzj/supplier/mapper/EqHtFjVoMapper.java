package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.litbo.hospitalzj.supplier.vo.EqHtFjVo;

@Mapper
public interface EqHtFjVoMapper {
	@Select("select ht_id htId,ht_ghsn htGhsn,ht_ghslxr htGhslxr,ht_ghsdh htGhsdh,ht_hthao htHthao,ht_zhbhao htZhbhao,ht_bz htBz,ht_qytime htQytime,ht_dhtime htDhtime,ht_bxtime htBxtime,ht_syks htSyks,ht_azdd htAzdd,ht_ly htLy,ht_cgfs htCgfs,ht_sglb htSgib,ht_sbyt htSbib,ht_jfly htJfly,ht_jlsb htJlsb,ht_fssb htFssb,ht_file1 htFile1,ht_file2 htFile2,ht_file3 htfile3,ht_file4 htFile4,ht_state htState,ht_yzm htYzm,sbcs_id sbcsId,eq_id eqId,ht_ids htIds,eq_pm eqPm,eq_gg eqGg,eq_xh eqXh,eq_jldw_id eqJldwId,eq_price eqPrice,eq_zczbh eqZczbh,eq_scbh eqScbh,eq_num eqNum,eq_totalprice eqTotalprice,eq_ccdate eqCcdate,eq_cscs eqCscs,eq_gb eqGb,eq_bgbh eqBgbh,eq_sh_fws eqShFws,eq_sh_qddh eqShQddh,eq_sh_shjl eqShShjl,eq_sh_jldh eqShJldh,eq_sh_fwr eqShFwr,eq_sh_lxrdh eqShLxrdh,eq_state eqState,eq_yzm eqYzm,eq_fjid eqFjid,eq_ids eqIds,eq_fjmc eqFjmc,eq_fjxh eqFjxh,eq_fjsl eqFjsl,eq_fjdw eqFjdw,eq_fjsccs eqFjsccs,eq_fjccbh eqFjccbh,bz from ht_info a left join eq_info b on  a.ht_id=b.ht_ids left join eq_fj c on b.eq_id=c.eq_ids where ht_yzm=#{htYzm}")
	List<EqHtFjVo> eqHtFjVo(String htYzm);
	
	
}
