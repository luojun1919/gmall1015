package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsProductInfo;

import java.util.List;

/**
 * @author ChinesePanda
 * @ClassName: SpuService
 * @Description: 数据服务接口
 * @Auther: luoJun
 * @Date: 2019/8/15 18:23
 */
public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);
}
