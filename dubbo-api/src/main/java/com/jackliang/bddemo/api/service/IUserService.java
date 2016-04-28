package com.jackliang.bddemo.api.service;

import com.jackliang.bddemo.api.service.response.LoginResponse;
import com.jackliang.bddemo.api.service.request.LoginRequest;

/**
 * UserService
 *
 * @author liangck
 * @version 1.0
 * @since 16/4/26 17:01
 */
public interface IUserService {

    /**
     * login
     * @param request
     * @return
     */
    LoginResponse login(LoginRequest request);

}
