package com.lx.springbootlearn.dao;

import com.lx.springbootlearn.model.HealthGuide;
import java.util.List;

public interface HealthGuideMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HealthGuide record);

    HealthGuide selectByPrimaryKey(Integer id);

    List<HealthGuide> selectAll();

    int updateByPrimaryKey(HealthGuide record);
}