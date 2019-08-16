package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsProductInfo;
import com.atguigu.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
        return "https://m.360buyimg.com/babel/jfs/t5137/20/1794970752/352145/d56e4e94/591417dcN4fe5ef33.jpg";
    }


    /**
     * @Description: 保存商品
     * @param: [pmsProductInfo]
     * @return: java.lang.String
     * @Date: 2019/8/15 20:38
     */
    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){

        return "";
    }

}
