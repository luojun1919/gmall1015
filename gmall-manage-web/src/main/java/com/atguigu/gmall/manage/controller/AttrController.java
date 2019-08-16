package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsBaseAttrInfo;
import com.atguigu.gmall.bean.PmsBaseAttrValue;
import com.atguigu.gmall.bean.PmsBaseSaleAttr;
import com.atguigu.gmall.service.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ChinesePanda 商品平台属性
 * @ClassName: AttrController
 * @Description:
 * @Date: 2019/8/15 13:49
 */
@Controller
@CrossOrigin
public class AttrController {

    @Reference
    private AttrService attrService;

    /**
     * @Description: 平台属性
     * @param: [catalog3Id]
     * @return: java.util.List<com.atguigu.gmall.bean.PmsBaseAttrInfo>
     * @Date: 2019/8/15 14:03
     */
    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        return attrService.attrInfoList(catalog3Id);
    }

    /**
     * @Description: 属性值
     * @param: [attrId]
     * @return: java.util.List<com.atguigu.gmall.bean.PmsBaseAttrValue>
     * @Date: 2019/8/15 15:08
     */
    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(String attrId){
        return attrService.getAttrValueList(attrId);
    }


    /**
     * @Description: 添加属性
     * @param: [pmsBaseAttrInfo]
     * @return: java.lang.String
     * @Date: 2019/8/15 15:26
     */
    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        return attrService.saveAttrInfo(pmsBaseAttrInfo);
    }


    /**
     * @Description: 销售属性
     * @param: []
     * @return: java.util.List<com.atguigu.gmall.bean.PmsBaseSaleAttr>
     * @Date: 2019/8/15 20:31
     */
    @RequestMapping("baseSaleAttrList")
    @ResponseBody
    public List<PmsBaseSaleAttr> baseSaleAttrList(){
        return attrService.baseSaleAttrList();
    }

}
