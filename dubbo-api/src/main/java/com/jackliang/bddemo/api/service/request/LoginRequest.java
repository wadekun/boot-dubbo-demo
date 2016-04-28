package com.jackliang.bddemo.api.service.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liangck
 * @version 1.0
 * @since 16/4/26 17:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest implements Serializable{
    private String username;
    private String password;

}
