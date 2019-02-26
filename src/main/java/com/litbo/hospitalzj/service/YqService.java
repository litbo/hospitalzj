package com.litbo.hospitalzj.service;

import com.litbo.hospitalzj.entity.Yq;

public interface YqService {
    Yq insert(Yq yq);

    Yq select(Integer jcyqId);

    void update(Yq yq);

    void delete(Integer jcyqId);
}
