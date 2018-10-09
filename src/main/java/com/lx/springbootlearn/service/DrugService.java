package com.lx.springbootlearn.service;

import com.lx.springbootlearn.model.DrugInfoCopy1;
import org.hibernate.validator.constraints.EAN;

import java.util.List;

/**
 * description
 * projectName  springboot-learn
 * package com.lx.springbootlearn.service
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
 * @date Created in 2018-10-09 14:02
 * modified By
 * updateDate
 */
public interface DrugService {
    List<DrugInfoCopy1> selectAll();
}
