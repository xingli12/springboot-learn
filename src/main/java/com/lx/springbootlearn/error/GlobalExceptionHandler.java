package com.lx.springbootlearn.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lx
 * @Title： GlobalExceptionHandler
 * @Package： com.lx.springbootlearn.error
 * @date 2018-08-02 23:48
 * @description:
 * @Modified By:
 * @UpdateDate:
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("errorCode", "101");
        map.put("errorMsg", "系统错误!");
        return map;
    }
}
