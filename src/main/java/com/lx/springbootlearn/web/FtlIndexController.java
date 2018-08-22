package com.lx.springbootlearn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author lx
 * @Title： FTLIndexController
 * @Package： com.lx.springbootlearn.web
 * @date 2018-08-02 23:21
 * @description:
 * @Modified By:
 * @UpdateDate:
 */
@Controller
public class FtlIndexController {

    @RequestMapping("/freemarkerIndex")
    public String index(Map<String, Object> result) {
        result.put("name", "yushengjun");
        result.put("sex", "0");
        List<String> listResult = new ArrayList<String>();
        listResult.add("zhangsan");
        listResult.add("lisi");
        listResult.add("itmayiedu");
        result.put("listResult", listResult);
        return "ftlIndex";
    }
}
