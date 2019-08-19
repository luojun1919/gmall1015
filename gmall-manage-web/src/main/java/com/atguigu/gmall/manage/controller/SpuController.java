package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsProductImage;
import com.atguigu.gmall.bean.PmsProductInfo;
import com.atguigu.gmall.bean.PmsProductSaleAttr;
import com.atguigu.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import util.PmsUploadUtil;

import java.util.List;

/**
 * @author ChinesePanda
 * @ClassName: SpuController
 * @Description:  spu
 * @Date: 2019/8/15 18:17
 */
@Controller
@CrossOrigin
public class SpuController {

    @Reference
    private SpuService spuService;

    /**
     * @Description: 查询spu
     * @param: [catalog3Id]
     * @return: java.util.List<com.atguigu.gmall.bean.PmsProductInfo>
     * @Date: 2019/8/15 18:27
     */
    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3Id){
        return spuService.spuList(catalog3Id);
    }


    /**
     * @Description: 保存文件
     * @param: [multipartFile]
     * @return: java.lang.String
     * @Date: 2019/8/15 21:29
     */
    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile){
        //将图片上传到分布式fastDFS文件服务器上
        //将图片的访问路径返回到前台
        return PmsUploadUtil.uploadImage(multipartFile);
    }


    /**
     * @Description: 保存商品spu
     * @param: [pmsProductInfo]
     * @return: java.lang.String
     * @Date: 2019/8/15 20:38
     */
    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){
        return spuService.saveSpuInfo(pmsProductInfo);
    }


    /**
     * @Description: sku
     * @param: [spuId]
     * @return: java.lang.String
     * @Date: 2019/8/15 20:38
     */
    @RequestMapping("spuSaleAttrList")
    @ResponseBody
    public List<PmsProductSaleAttr> spuSaleAttrList(String spuId){
        return spuService.spuSaleAttrList(spuId);
    }


    /**
     * @Description: sku
     * @param: [spuId]
     * @return: java.lang.String
     * @Date: 2019/8/15 20:38
     */
    @RequestMapping("spuImageList")
    @ResponseBody
    public List<PmsProductImage> spuImageList(String spuId){
        return spuService.spuImageList(spuId);
    }


}
