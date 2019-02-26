package com.litbo.hospitalzj.hospital.controller;

import com.litbo.hospitalzj.hospital.service.AcceptService;
import com.litbo.hospitalzj.supplier.entity.HtInfo;
import com.litbo.hospitalzj.supplier.service.EqCsService;
import com.litbo.hospitalzj.supplier.service.HtInfoService;
import com.litbo.hospitalzj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(value = "selectAllHt",method = RequestMethod.GET)
    public ResponseResult selectAllHt(){
        List<HtInfo> htInfos=htInfoService.selectAllHtInfo();

        return new ResponseResult<List<HtInfo>>(SUCCESS,htInfos);
    }
    @RequestMapping(value = "selectAllHtWaitRegister",method = RequestMethod.GET)
    public ResponseResult selectAllHtWaitRegister(){
        List<HtInfo> htInfos=htInfoService.selectAllHtWaitRegister();
        return new ResponseResult<List<HtInfo>>(SUCCESS,htInfos);
    }
    @RequestMapping(value = "selectHtInfoById",method = RequestMethod.POST)
    public ResponseResult selectAllHt(Integer htId){
        HtInfo htInfo=htInfoService.select(htId);
        return new ResponseResult<HtInfo>(SUCCESS,htInfo);
    }
    @RequestMapping(value = "acceptHtInfoById",method = RequestMethod.POST)
    public ResponseResult AgreeHtInfoById(String view,Integer htId,String yy,String date){
        if("同意".equals(view)){
            int res = htInfoService.agreeHtInfoById(htId,yy,date);
        }else {
            int res = htInfoService.refuseHtInfoById(htId,yy,null);
        }
        return new ResponseResult<>(SUCCESS);
    }

}
