package com.jackliang.bddemo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jackliang.bddemo.api.service.IUserService;
import com.jackliang.bddemo.api.service.request.LoginRequest;
import com.jackliang.bddemo.api.service.response.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangck
 * @version 1.0
 * @since 16/4/28 14:05
 */
@RestController
public class LoginController {

    @Reference(version = "1.0.0")
    private IUserService userService;

    /**
     * login
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<LoginResponse> login(String username, String password) {
        return ResponseEntity.ok(userService.login(new LoginRequest(username, password)));
    }
}
