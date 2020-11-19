package com.hg.controller;

import com.hg.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/feign")
public class FeignController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/getUserList")
    public Map<String,Object> getUserList(){
        return iUserService.getUserList();
    }
}
