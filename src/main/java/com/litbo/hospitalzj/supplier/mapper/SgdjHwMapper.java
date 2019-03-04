package com.litbo.hospitalzj.supplier.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.litbo.hospitalzj.supplier.entity.SgdjHw;
@Mapper
public interface SgdjHwMapper {
	@Insert("insert into sg_djhw (djhw_id,ht_ids,djhw_wbz,"
			+ "djhw_ysbs,djhw_sbwg,djhw_sxwj,djhw_bz1,djhw_bz2,djhw_bz3,djhw_bz4,djhw_bz5,"
			+ "djhw_bz6,djhw_bz7,djhw_bz8,djhw_bz9,djhw_bz10,djhw_bz11,djhw_bz12,djhw_bz13,"
			+ "djhw_bz14,djhw_bz15,djhw_bz16) value "
			+ "(#{djhwId},#{htIds},#{djhwWbz},#{djhwYsbs},"
			+ "#{djhwSbwg},#{djhwSxwj},#{djhwBz1},#{djhwBz2},#{djhwBz3},#{djhwBz4},#{djhwBz5},"
			+ "#{djhwBz6},#{djhwBz7},#{djhwBz8},#{djhwBz9},#{djhwBz10},#{djhwBz11},#{djhwBz12},"
			+ "#{djhwBz13},#{djhwBz14},#{djhwBz15},#{djhwBz16})")
	Integer insertSgdjHw(SgdjHw sgdjhw);
	
	@Select("select djhw_id djhwId,ht_ids htIds,djhw_wbz djhwWbz,djhw_ysbs djhwYsbs,"
			+ "djhw_sbwg djhwSbwg,djhw_sxwj djhwSxwj,djhw_bz1 djhwBz1,djhw_bz2 djhwBz2,djhw_bz3 djhwBz3,djhw_bz4 djhwBz4,"
			+ "djhw_bz5 djhwBz5,djhw_bz6 djhwBz6,djhw_bz7 djhwBz7,djhw_bz8 djhwBz8,djhw_bz9 djhwBz9,djhw_bz10 djhwBz10,"
			+ "djhw_bz11 djhwBz11,djhw_bz12 djhwBz12,djhw_bz13 djhwBz13,djhw_bz14 djhwBz14,djhw_bz15 djhwBz15,djhw_bz16 djhwBz16,djhw_url from "
			+ "sg_djhw where ht_ids=#{htIds}")
	SgdjHw selectSgdjHw(Integer htIds);
	
	@Update("update sg_djhw set djhw_wbz=#{djhwWbz},djhw_ysbs=#{djhwYsbs},"
			+ "djhw_sbwg=#{djhwSbwg},djhw_sxwj=#{djhwSxwj},djhw_bz1=#{djhwBz1},djhw_bz2=#{djhwBz2},djhw_bz3=#{djhwBz3},"
			+ "djhw_bz4=#{djhwBz4},djhw_bz5=#{djhwBz5},djhw_bz6=#{djhwBz6},djhw_bz7=#{djhwBz7},djhw_bz8=#{djhwBz8},"
			+ "djhw_bz9=#{djhwBz9},djhw_bz10=#{djhwBz10},djhw_bz11=#{djhwBz11},djhw_bz12=#{djhwBz12},djhw_bz13=#{djhwBz13},"
			+ "djhw_bz14=#{djhwBz14},djhw_bz15=#{djhwBz15},djhw_bz16=#{djhwBz16} where ht_ids=#{htIds}")
	Integer updateInfo(SgdjHw sgdjhw); 
	
	@Update("UPDATE sg_djhw SET djhw_bz1=#{djhwBz1},djhw_bz2=#{djhwBz2},djhw_bz3=#{djhwBz3},djhw_bz4=#{djhwBz4} where djhw_id=#{djhwId}")
	Integer updateOne(@Param("djhwId") Integer djhwId, @Param("htFile") String htFile);
	@Update("update sg_djhw set djhw_url = CONCAT(djhw_url,#{path}) where ht_ids = #{htIds}")
    int updateURL(@Param("htIds") Integer htIds, @Param("path") String path);

	@Select("select djhw_id djhwId,ht_ids htIds,djhw_wbz djhwWbz,djhw_ysbs djhwYsbs,"
			+ "djhw_sbwg djhwSbwg,djhw_sxwj djhwSxwj,djhw_bz1 djhwBz1,djhw_bz2 djhwBz2,djhw_bz3 djhwBz3,djhw_bz4 djhwBz4,"
			+ "djhw_bz5 djhwBz5,djhw_bz6 djhwBz6,djhw_bz7 djhwBz7,djhw_bz8 djhwBz8,djhw_bz9 djhwBz9,djhw_bz10 djhwBz10,"
			+ "djhw_bz11 djhwBz11,djhw_bz12 djhwBz12,djhw_bz13 djhwBz13,djhw_bz14 djhwBz14,djhw_bz15 djhwBz15,djhw_bz16 djhwBz16 from "
			+ "sg_djhw where ht_ids=#{htIds}")
	SgdjHw selectSgdjHwByHtIds(Integer htIds);
	@Select("select djhw_url from sg_djhw where ht_ids = #{htIds}")
	String showImages(Integer htIds);
}
