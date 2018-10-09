package com.lx.springbootlearn.dao;

import com.lx.springbootlearn.model.SimpleDrugDicCopy1;
import java.util.List;

public interface SimpleDrugDicCopy1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SimpleDrugDicCopy1 record);

    SimpleDrugDicCopy1 selectByPrimaryKey(Integer id);

    List<SimpleDrugDicCopy1> selectAll();

    int updateByPrimaryKey(SimpleDrugDicCopy1 record);
}