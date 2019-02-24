package com.litbo.hospitalzj.supplier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.litbo.hospitalzj.supplier.entity.EqCs;
@Mapper
public interface EqCsMapper {
	@Insert("insert into eq_cs (sbcs_name,sbcs_pwd,sbcs_address,sbcs_lxdh1,sbcs_Certificate,sbcs_creditcode,sbcs_Certificatep,sbcs_creditcodep) value "
			+ "(#{sbcsName},#{sbcsPwd},#{sbcsAddress},#{sbcsLxdh1},#{sbcsCertificate},#{sbcsCreditcode},#{sbcsCertificatep},#{sbcsCreditcodep})")
	Integer gongAdd(EqCs eqcs);
	
	@Update("UPDATE eq_cs SET sbcs_name=#{sbcsName},sbcs_address=#{sbcsAddress},"
			+ "sbcs_lxdh1=#{sbcsLxdh1},sbcs_Certificate=#{sbcsCertificate},"
			+ "sbcs_creditcode=#{sbcsCreditcode},sbcs_Certificatep=#{sbcsCertificatep},"
			+ "sbcs_creditCodep=#{sbcsCreditcodep} where sbcs_id=#{sbcsId}")
	Integer updataInfo(EqCs eqcs);
	@Delete("delete from eq_cs where sbcs_id=#{sbcsId}")
	Integer deleteGongInfo(Integer sbcsId);
	@Select("select sbcs_id as sbcsId,sbcs_name as sbcsName,sbcs_pwd as sbcsPwd,sbcs_address as sbcsAddress,sbcs_lxdh1 as sbcsLxdh1 from eq_cs where sbcs_name=#{sbcsName}")
	EqCs findBySbcsName(String sbcsName);
	
	@Select("select sbcs_id as sbcsId,sbcs_name as sbcsName,sbcs_address as sbcsAddress,sbcs_lxdh1 as sbcsLxdh1,sbcs_certificate as sbcsCertificate,sbcs_creditcode sbcsCreditcode,sbcs_certificatep sbcsCertificatep,sbcs_creditcodep sbcsCreditcodep from eq_cs where sbcs_id=#{sbcsId}")
	EqCs findBySbcsId(Integer sbcsId);
	
	@Select("select sbcs_id as sbcsId,sbcs_name as sbcsName,sbcs_address as sbcsAddress,sbcs_lxdh1 as sbcsLxdh1,sbcs_certificate as sbcsCertificate,sbcs_creditcode sbcsCreditcode,sbcs_certificatep sbcsCertificatep,sbcs_creditcodep sbcsCreditcodep from eq_cs")
	List<EqCs> findAll();
	
}
