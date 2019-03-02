package com.litbo.hospitalzj.user.service.impl;

import com.litbo.hospitalzj.user.bean.EqNdjh;
import com.litbo.hospitalzj.user.bean.EqZjls;
import com.litbo.hospitalzj.user.dao.EqNdjhDao;
import com.litbo.hospitalzj.user.dao.EqZjlsDao;
import com.litbo.hospitalzj.user.service.EqNdjhService;
import com.litbo.hospitalzj.user.service.EqZjlsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EqZjlsServiceImpl implements EqZjlsService {
    @Autowired
    private EqZjlsDao eqZjlsDao;


    @Override
    public int delete(Integer dzId) {
        return eqZjlsDao.delete(dzId);
    }

    @Override
    public int insert(EqZjls eqZjls) {
        return eqZjlsDao.insert(eqZjls);
    }

    @Override
    public List<EqZjls> selectAll() {
        return eqZjlsDao.selectAll();
    }

    @Override
    public EqZjls select(Integer dzId) {
        return eqZjlsDao.select(dzId);
    }

    @Override
    public Integer count(String tester) {
        return eqZjlsDao.count(tester);
    }
}
