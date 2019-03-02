package com.litbo.hospitalzj.user.controller;

import com.litbo.hospitalzj.controller.BaseController;
import com.litbo.hospitalzj.supplier.entity.EqCgfs;
import com.litbo.hospitalzj.user.bean.EqNdjh;
import com.litbo.hospitalzj.user.service.EqNdjhService;
import com.litbo.hospitalzj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 年度计划控制层
 */
@RestController
@RequestMapping("/eqndjh")
public class EqNdjhController extends BaseController {
    @Autowired
    private EqNdjhService eqNdjhService;
    
    @RequestMapping("/{jcjhId}")
    public ResponseResult<EqNdjh> getByCode(@PathVariable("jcjhId")Integer jcjhId) {
        EqNdjh data=eqNdjhService.select(jcjhId);
        return new ResponseResult<EqNdjh>(SUCCESS,data);
    }
    @RequestMapping("/all")
    @ResponseBody
    public ResponseResult<List<EqNdjh>> getAll() {
        List<EqNdjh> data=eqNdjhService.selectAll();
        return new ResponseResult<List<EqNdjh>>(SUCCESS,data);
    }
    @RequestMapping("/insert")
    public ResponseResult<Void> insert(EqNdjh eqNdjh) {
        eqNdjhService.insert(eqNdjh);
        return new ResponseResult<Void>(SUCCESS);
    }
    @RequestMapping("/delete")
    public ResponseResult<Void> delete(Integer jcjhId) {
        eqNdjhService.delete(jcjhId);
        return new ResponseResult<Void>(SUCCESS);
    }
    @RequestMapping("/update")
    public ResponseResult<EqNdjh> update(EqNdjh eqNdjh) {
        EqNdjh data=eqNdjhService.update(eqNdjh);
        return new ResponseResult<EqNdjh>(SUCCESS,data);
    }
}
