package com.atguigu.gmall.bean;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author ChinesePanda
 */
public class PmsBaseCatalog1 implements Serializable {
    private static final long serialVersionUID = -3263074587660123556L;
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String name;

    /**
     * @Description: Transient 不保存数据库 catalog2s
     * @Date: 2019/8/15 13:12
     */
    @Transient
    private List<PmsBaseCatalog2> catalog2s;

    public List<PmsBaseCatalog2> getCatalog2s() {
        return catalog2s;
    }

    public void setCatalog2s(List<PmsBaseCatalog2> catalog2s) {
        this.catalog2s = catalog2s;
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

