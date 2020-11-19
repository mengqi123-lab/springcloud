package com.hg.controller;

import com.hg.model.UserBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserApiController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/getUserList")
    public Map<String,Object> getUserList(){
        try{
            Thread.sleep(100);
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
        System.out.println("我是：" + port + "有人调用我啦");
        ArrayList<UserBean> datalist = new ArrayList<>();
        UserBean userBean = new UserBean();
        userBean.setUserId(1);
        userBean.setUserName("测试1");
        datalist.add(userBean);
        UserBean userBean1 = new UserBean();
        userBean1.setUserId(2);
        userBean1.setUserName("测试2");
        datalist.add(userBean1);

        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("code",200);
        resultMap.put("msg","调用成功");
        resultMap.put("data",datalist);
        return resultMap;
    }
}
