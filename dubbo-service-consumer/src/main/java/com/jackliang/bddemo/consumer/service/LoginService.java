package com.jackliang.bddemo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jackliang.bddemo.api.service.IUserService;
import com.jackliang.bddemo.api.service.request.LoginRequest;
import com.jackliang.bddemo.api.service.response.LoginResponse;
import org.springframework.stereotype.Service;

/**
 * @author liangck
 * @version 1.0
 * @since 16/4/28 14:01
 */
@Service
public class LoginService {

    @Reference(version = "1.0.0")
    private IUserService userService;

    public LoginResponse login(String username, String password) {
        LoginRequest request = new LoginRequest();
        request.setPassword(password);
        request.setUsername(username);
        return userService.login(request);
    }
}
