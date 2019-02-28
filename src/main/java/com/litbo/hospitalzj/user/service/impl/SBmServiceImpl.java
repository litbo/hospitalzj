package com.litbo.hospitalzj.user.service.impl;

import com.litbo.hospitalzj.service.exception.NotFoundException;
import com.litbo.hospitalzj.supplier.service.exception.DeleteException;
import com.litbo.hospitalzj.supplier.service.exception.InsertException;
import com.litbo.hospitalzj.supplier.service.exception.UpdateException;
import com.litbo.hospitalzj.user.bean.SBm;
import com.litbo.hospitalzj.user.dao.SBmDao;
import com.litbo.hospitalzj.user.service.SBmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SBmServiceImpl implements SBmService {
    @Autowired
    private SBmDao sBmDao;

    @Override
    public SBm select(String bmId) {
        SBm data=sBmDao.select(bmId);
        return data;
    }

    @Override
    public List<SBm> selectAll() {
        return sBmDao.selectAll();
    }

    @Override
    public void delete(String bmId) {
        SBm data=sBmDao.select(bmId);
        if(data==null){
            throw new DeleteException("该项部们不存在");
        }
        sBmDao.delete(bmId);
    }

    @Override
    public void update(SBm sbm) {
        SBm data=sBmDao.select(sbm.getBmId());
        if(data==null){
            throw new UpdateException("该项部们不存在");
        }
        sBmDao.update(sbm);
    }

    @Override
    public void insert(SBm sBm) {
        SBm data=sBmDao.selectByName(sBm.getBmName());
        if(data!=null){
            throw new InsertException("该项部门已存在");
        }
        sBmDao.insert(data);
    }


}
