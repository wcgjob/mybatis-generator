package com.dao;

import com.pojo.student;

public interface studentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(student record);

    int insertSelective(student record);

    student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(student record);

    int updateByPrimaryKey(student record);
}