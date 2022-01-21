package com.example.jasypt;

import com.example.jasypt.KyeCompany;

public interface KyeCompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KyeCompany record);

    int insertSelective(KyeCompany record);

    KyeCompany selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KyeCompany record);

    int updateByPrimaryKey(KyeCompany record);
}