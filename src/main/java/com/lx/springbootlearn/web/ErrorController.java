package com.lx.springbootlearn.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lx
 * @Title： ErrorController
 * @Package： com.lx.springbootlearn.web
 * @date 2018-08-02 23:52
 * @description:
 * @Modified By:
 * @UpdateDate:
 */
//@RestController
public class ErrorController {

    private static final Logger logger = LoggerFactory.getLogger(ErrorController.class);
    @GetMapping("/getnum")
    public String getNum(int i){
        logger.info(String.format("调用getnum，入参为：%d",1));
        logger.error("错误测试！！");

        int j = 10;
        j = j/i;
        return "结果是："+ j;
    }
}
