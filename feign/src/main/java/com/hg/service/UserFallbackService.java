package com.hg.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 降级处理类
 */
@Component
public class UserFallbackService implements IUserService{

    public Map<String,Object> getUserList(){
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("code","500");
        resultMap.put("msg","调用失败，服务被降级");
        resultMap.put("data",null);
        return  resultMap;
    }
}
