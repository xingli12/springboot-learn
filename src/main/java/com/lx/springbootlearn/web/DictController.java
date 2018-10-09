package com.lx.springbootlearn.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lx.springbootlearn.model.DrugInfoCopy1;
import com.lx.springbootlearn.model.SimpleDrugDicCopy1;
import com.lx.springbootlearn.service.DrugService;
import com.lx.springbootlearn.service.SimpleDrugDicService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * description
 * projectName  springboot-learn
 * package com.lx.springbootlearn.web
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
 * @date Created in 2018-10-09 13:56
 * modified By
 * updateDate
 */
@RestController
public class DictController {
    @Autowired
    private DrugService drugService;

    @Autowired
    private SimpleDrugDicService simpleDrugDicService;

    @GetMapping(value = "/getDrug",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getDrug(){
        LinkedHashMap<String,List<String>> hashMap = new LinkedHashMap<>();
        List<DrugInfoCopy1> drugInfoCopy1s = drugService.selectAll();
        for(DrugInfoCopy1 drugInfoCopy1:drugInfoCopy1s ){
            List<String> list = new ArrayList<>();
            if(StringUtils.isNotBlank(drugInfoCopy1.getFrequency())){
            list.add(drugInfoCopy1.getFrequency().trim());
            }
            if(StringUtils.isNotBlank(drugInfoCopy1.getQuantity())) {
                list.add(drugInfoCopy1.getQuantity().trim());
            }
            if(StringUtils.isNotBlank(drugInfoCopy1.getSpecifications())){
            list.add(drugInfoCopy1.getSpecifications().trim());
            }
            if(StringUtils.isNotBlank(drugInfoCopy1.getUnit())){
            list.add(drugInfoCopy1.getUnit().trim());
            }
            hashMap.put(drugInfoCopy1.getDrugName(),list);
        }

      String s = JSON.toJSONString(hashMap);
        return s;

    }

    @GetMapping(value = "/getDic",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getDic(){
        LinkedHashMap<String,List<String>> hashMap = new LinkedHashMap<>();
        List<SimpleDrugDicCopy1> simpleDrugDicCopy1s = simpleDrugDicService.selectAll();
        for (SimpleDrugDicCopy1 si: simpleDrugDicCopy1s
             ) {
            List<String> list = new ArrayList<>();
            if(StringUtils.isNotBlank(si.getT1())){
                list.add(si.getT1().trim());
            }
            if(StringUtils.isNotBlank(si.getT2())){
                list.add(si.getT2().trim());
            }
            if(StringUtils.isNotBlank(si.getT3())){
                list.add(si.getT3().trim());
            }
            if(StringUtils.isNotBlank(si.getT4())){
                list.add(si.getT4().trim());
            }
            if(StringUtils.isNotBlank(si.getT5())){
                list.add(si.getT5().trim());
            }
            hashMap.put(si.getDiseaseName(),list);
        }

        return JSON.toJSONString(hashMap);
    }


}
