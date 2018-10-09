package com.lx.springbootlearn.service.impl;

import com.lx.springbootlearn.dao.SimpleDrugDicCopy1Mapper;
import com.lx.springbootlearn.model.SimpleDrugDicCopy1;
import com.lx.springbootlearn.service.SimpleDrugDicService;
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
 * @date Created in 2018-10-09 14:07
 * modified By
 * updateDate
 */
@Service
public class SimpleDrugDicServiceImpl implements SimpleDrugDicService {

    @Autowired
    private SimpleDrugDicCopy1Mapper simpleDrugDicCopy1Mapper;
    @Override
    public List<SimpleDrugDicCopy1> selectAll() {
        return simpleDrugDicCopy1Mapper.selectAll();
    }
}
