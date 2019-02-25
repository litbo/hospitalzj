package com.litbo.hospitalzj.hospital.controller;

import com.litbo.hospitalzj.hospital.enums.EnumProcess;
import com.litbo.hospitalzj.hospital.service.AcceptService;
import com.litbo.hospitalzj.supplier.entity.EqCs;
import com.litbo.hospitalzj.supplier.entity.HtInfo;
import com.litbo.hospitalzj.supplier.service.EqCsService;
import com.litbo.hospitalzj.supplier.service.HtInfoService;
import com.litbo.hospitalzj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("accept")
public class AcceptController {
    /**
     * 正确响应时的代号
     */
    public static final Integer SUCCESS = 200;
    @Autowired
    private AcceptService acceptService;
    @Autowired
    private EqCsService eqCsService;
    @Autowired
    private HtInfoService htInfoService;
    @RequestMapping("selectAllHt")
    public ResponseResult selectAllHt(){
        List<HtInfo> htInfos=htInfoService.selectHtinfo();

        return new ResponseResult<List<HtInfo>>(SUCCESS,htInfos);
    }
}
