package com.litbo.hospitalzj.mapper.yq;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.litbo.hospitalzj.entity.Yq;

@Mapper
public interface YqMapper {
	/**
	 * 插入检测仪器
	 * @param yq
	 * @return
	 */
	@Insert("insert into yq (jcyq_id,jcyq_name,jcyq_xh,jcyq_xzzq_time,jcyq_dah,jcyq_bh,jcyq_cj_id,jcyq_qy_time,jcyq_ks_id,"+
			"jcyq_cf,jcyq_url,jcyq_jz_time,mb_id) value (#{jcyqId}, #{jcyqName},#{jcyqXh},#{jcyqXzzqTime},#{jcyqDah},#{jcyqBh},#{jcyqCjId},"+
			"#{jcyqQyTime},#{jcyqKsId},#{jcyqCf},#{jcyqUrl},#{jcyqJzTime},#{mbId})") 
	Integer insertYq(Yq yq);
	@Select("select * from yq where jcyq_id=#{jcyqId}")
	Yq getYq(String jcyqId);
	
	@Update("Update yq set jcyq_name=#{jcyqName} where jcyq_id=#{jcyqId}")
	Integer updateInfo(@Param("jcyqId") String jcyqId, @Param("jcyqName") String jcyqName);
} 