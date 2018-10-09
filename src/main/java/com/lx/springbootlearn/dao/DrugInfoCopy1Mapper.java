package com.lx.springbootlearn.dao;

import com.lx.springbootlearn.model.DrugInfoCopy1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface DrugInfoCopy1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DrugInfoCopy1 record);

    DrugInfoCopy1 selectByPrimaryKey(Integer id);

    List<DrugInfoCopy1> selectAll();

    int updateByPrimaryKey(DrugInfoCopy1 record);
}