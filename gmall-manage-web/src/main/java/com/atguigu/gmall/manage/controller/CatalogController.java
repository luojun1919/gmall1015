package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.bean.PmsBaseCatalog2;
import com.atguigu.gmall.bean.PmsBaseCatalog3;
import com.atguigu.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ChinesePanda  CrossOrigin  解决跨域注解
 * @ClassName: CatalogController
 * @Description:
 * @Date: 2019/8/14 20:52
 */
@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    private CatalogService catalogService;

    /**
     * @Description: 一级分类
     * @param: []
     * @return: java.util.List<com.atguigu.gmall.bean.PmsBaseCatalog1>
     * @Date: 2019/8/15 12:56
     */
    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        return catalogService.getCatalog1();
    }


    /**
     * @Description: 二级分类
     * @param: []
     * @return: java.util.List<com.atguigu.gmall.bean.PmsBaseCatalog2>
     * @Date: 2019/8/15 13:36
     */
    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        return catalogService.getCatalog2(catalog1Id);
    }

    /**
     * @Description: 三级分类
     * @param: []
     * @return: java.util.List<com.atguigu.gmall.bean.PmsBaseCatalog3>
     * @Date: 2019/8/15 13:36
     */
    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        return catalogService.getCatalog3(catalog2Id);
    }

}
