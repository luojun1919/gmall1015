package com.atguigu.gmall.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author ChinesePanda
 */
public class PmsBaseSaleAttr implements Serializable {

    private static final long serialVersionUID = 1045441752987698379L;
    @Id
    @Column
    private String id ;

    @Column
    private String name;

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
