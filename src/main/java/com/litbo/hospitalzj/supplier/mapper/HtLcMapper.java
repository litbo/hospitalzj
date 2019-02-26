package com.litbo.hospitalzj.supplier.mapper;

import com.litbo.hospitalzj.supplier.entity.EqYt;
import com.litbo.hospitalzj.supplier.entity.HtLc;
import org.apache.ibatis.annotations.*;

import java.sql.JDBCType;
import java.util.List;

/**
 * 设备流程持久层接口
 * @author 刘洋
 *
 */
@Mapper
public interface HtLcMapper {
    @Insert("insert into ht_lc (lc_id, ht_id, ht_cldz, ht_clsj) " +
            "values (#{lcId,jdbcType =INTEGER}, #{htId,jdbcType=VARCHAR}, #{htCldz,jdbcType=VARCHAR}," +
            "#{htClsj,jdbcType=DATE})")
	Integer insertEqlc(HtLc eqlc);
    @Delete(" delete from ht_lc  where lc_id = #{lcId,jdbcType=INTEGER}")
    Integer delete(Integer lcId);
    @Select("select lc_id, ht_id, ht_cldz, ht_clsj from ht_lc where ht_id = #{htId}")
    HtLc select(Integer htId);
}
