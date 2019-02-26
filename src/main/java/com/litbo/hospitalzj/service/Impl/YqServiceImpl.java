package com.litbo.hospitalzj.service.Impl;

import com.litbo.hospitalzj.entity.Yq;
import com.litbo.hospitalzj.service.YqService;
import com.litbo.hospitalzj.service.exception.YqIsNullException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YqServiceImpl implements YqService {
@Autowired
private YqService yqService;

    @Override
    public Yq insert(Yq yq) {
        return yqService.insert(yq);
    }

    @Override
    public Yq select(Integer jcyqId) {
        Yq data=yqService.select(jcyqId);
        if(data==null){
            throw new YqIsNullException("仪器不存在，请添加");
        }
        return data;
    }

    @Override
    public void update(Yq yq) {
        yqService.update(yq);
    }

    @Override
    public void delete(Integer jcyqId) {
        yqService.delete(jcyqId);
    }
}
