package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsBaseAttrInfo;
import com.atguigu.gmall.bean.PmsBaseAttrValue;
import com.atguigu.gmall.bean.PmsBaseSaleAttr;

import java.util.List;

/**
 * @author ChinesePanda
 * @ClassName: AttrService
 * @Description: 数据服务接口
 * @Auther: luoJun
 * @Date: 2019/8/15 13:56
 */
public interface AttrService {

    /**
     * @Description:
     * @param: [catalog3Id]
     * @return: java.util.List<com.atguigu.gmall.bean.PmsBaseAttrInfo>
     * @Date: 2019/8/19 15:59
     */
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    /**
     * @Description:
     * @param: [attrId]
     * @return: java.util.List<com.atguigu.gmall.bean.PmsBaseAttrValue>
     * @Date: 2019/8/19 15:59
     */
    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    /**
     * @Description:
     * @param: [pmsBaseAttrInfo]
     * @return: java.lang.String
     * @Date: 2019/8/19 15:59
     */
    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    /**
     * @Description:
     * @param: []
     * @return: java.util.List<com.atguigu.gmall.bean.PmsBaseSaleAttr>
     * @Date: 2019/8/19 16:00
     */
    List<PmsBaseSaleAttr> baseSaleAttrList();
}
