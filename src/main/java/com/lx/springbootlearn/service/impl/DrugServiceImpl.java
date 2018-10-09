package com.lx.springbootlearn.service.impl;

import com.lx.springbootlearn.dao.DrugInfoCopy1Mapper;
import com.lx.springbootlearn.model.DrugInfoCopy1;
import com.lx.springbootlearn.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 * projectName  springboot-learn
 * package com.lx.springbootlearn.service.impl
 *
 * @author xingli12
 * @version v1
 * //      ┏┛ ┻━━━━━┛ ┻┓
 * //      ┃　　　　　　 ┃
 * //      ┃　　　━　　　┃
 * //      ┃　┳┛　  ┗┳　┃
 * //      ┃　　　　　　 ┃
 * //      ┃　　　┻　　　┃
 * //      ┃　　　　　　 ┃
 * //      ┗━┓　　　┏━━━┛
 * //        ┃　　　┃   神兽保佑
 * //        ┃　　　┃   代码无BUG！
 * //        ┃　　　┗━━━━━━━━━┓
 * //        ┃　　　　　　　    ┣┓
 * //        ┃　　　　         ┏┛
 * //        ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
 * //          ┃ ┫ ┫   ┃ ┫ ┫
 * //          ┗━┻━┛   ┗━┻━┛
 * @date Created in 2018-10-09 14:05
 * modified By
 * updateDate
 */
@Service
public class DrugServiceImpl implements DrugService {

    @Autowired
    private DrugInfoCopy1Mapper drugInfoCopy1Mapper;
    @Override
    public List<DrugInfoCopy1> selectAll() {
        return drugInfoCopy1Mapper.selectAll();
    }
}
