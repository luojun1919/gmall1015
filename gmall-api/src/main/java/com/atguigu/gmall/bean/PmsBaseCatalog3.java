package com.atguigu.gmall.bean;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author ChinesePanda
 * @ClassName: BaseCatalog3
 * @Description:
 * @Date: 2019/8/14 18:16
 */
public class PmsBaseCatalog3 implements Serializable {
    private static final long serialVersionUID = -4927640216542712007L;

    @Id
    private String id;
    private String name;
    private String catalog2Id;

    public String getCatalog2Id() {
        return catalog2Id;
    }

    public void setCatalog2Id(String catalog2Id) {
        this.catalog2Id = catalog2Id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
