package com.hg.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(value = "user-service",fallback = UserFallbackService.class)
public interface IUserService {

    @GetMapping("/api/user/getUserList")
    Map<String,Object> getUserList();
}
