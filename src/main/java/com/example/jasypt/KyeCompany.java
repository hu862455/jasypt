package com.example.jasypt;

import java.util.Date;

/**
    * 跨越-公司名称表
    */
public class KyeCompany {
    private Integer id;

    /**
    * 公司名称
    */
    private String companyName;

    /**
    * 更新时间
    */
    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}