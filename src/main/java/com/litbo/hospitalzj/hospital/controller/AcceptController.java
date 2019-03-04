package com.litbo.hospitalzj.hospital.controller;

import com.litbo.hospitalzj.hospital.service.AcceptService;
import com.litbo.hospitalzj.hospital.utils.FileUpload;
import com.litbo.hospitalzj.supplier.entity.HtInfo;
import com.litbo.hospitalzj.supplier.entity.SgdjHw;
import com.litbo.hospitalzj.supplier.service.EqCsService;
import com.litbo.hospitalzj.supplier.service.HtInfoService;
import com.litbo.hospitalzj.supplier.service.SgdjHwService;
import com.litbo.hospitalzj.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("accept")
public class AcceptController {
    /**
     * 正确响应时的代号
     */
    @Autowired
    private SgdjHwService sgdjHwService;
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
    @RequestMapping(value = "selectAllHtWaitAccept",method = RequestMethod.GET)
    public ResponseResult selectAllHtWaitAccept(){
        List<HtInfo> htInfos=htInfoService.selectAllHtWaitAccept();
        return new ResponseResult<List<HtInfo>>(SUCCESS,htInfos);
    }
    @RequestMapping(value = "selectAllHtAccept",method = RequestMethod.GET)
    public ResponseResult selectAllHtAccept(){
        List<HtInfo> htInfos=htInfoService.selectAllHtAccept();
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
    @RequestMapping(value = "uploadFile",method = RequestMethod.POST)
    public ResponseResult uploadFile(Integer htIds, MultipartFile file){
        if(htInfoService.select(htIds)==null){
            ResponseResult responseResult = new ResponseResult();
            responseResult.setMessage("找不到合同号");
            return responseResult;
        }
        String path = FileUpload.upload("images/upload/",file);
        System.out.println(path);
        SgdjHw sgdjHw = sgdjHwService.selectSgdjHw(htIds);
        if(sgdjHw!=null&&sgdjHw.getDjhwUrl().split(" ").length>7){
            ResponseResult responseResult = new ResponseResult();
            responseResult.setMessage("图片过多");
            return responseResult;
        }
        int res  = sgdjHwService.updateURL(htIds,path);
        return new ResponseResult(SUCCESS);
    }
    @RequestMapping(value = "showImages",method = RequestMethod.GET)
    public ResponseResult showImages(Integer htIds){
        String[] imgs = sgdjHwService.showImages(htIds);
        return new ResponseResult(SUCCESS,imgs);
    }

}
