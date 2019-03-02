package com.litbo.hospitalzj.user.service.impl;

import com.litbo.hospitalzj.supplier.service.exception.InsertException;
import com.litbo.hospitalzj.supplier.service.exception.UpdateException;
import com.litbo.hospitalzj.user.bean.EqNdjh;
import com.litbo.hospitalzj.user.dao.EqNdjhDao;
import com.litbo.hospitalzj.user.service.EqNdjhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 年度计划业务层
 */
@Service
public class EqNdjhServiceImpl implements EqNdjhService {
    @Autowired
    private EqNdjhDao eqNdjhDao;

    @Override
    public void insert(EqNdjh eqNdjh) {
        EqNdjh data=eqNdjhDao.select(eqNdjh.getJcjhId());
        if(data!=null){
            throw new InsertException("年度计划表已存在");
        }
        eqNdjhDao.insert(eqNdjh);
    }

    @Override
    public EqNdjh update(EqNdjh eqNdjh) {
        EqNdjh data=eqNdjhDao.select(eqNdjh.getJcjhId());
        if(data==null){
            throw new UpdateException("年度计划表不存在");
        }
        eqNdjhDao.update(eqNdjh);
        return eqNdjh;
    }

    @Override
    public EqNdjh select(Integer jcjhId) {
        EqNdjh data=eqNdjhDao.select(jcjhId);
        return data;
    }

    @Override
    public void delete(Integer jcjhId) {
        EqNdjh data=eqNdjhDao.select(jcjhId);
        if(data==null){
            throw new UpdateException("年度计划表不存在");
        }
        eqNdjhDao.delete(jcjhId);
    }

    @Override
    public List<EqNdjh> selectAll() {
        List<EqNdjh> data=eqNdjhDao.selectAll();
        return data;
    }
}
