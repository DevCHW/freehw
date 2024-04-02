package com.nemam.core.domain.login;

import lombok.Getter;

@Getter
public class Login {

    private String email;
    private String password;
    private String tokenSecretKey;
    private long tokenExpiredMs;
    private String loginIp;

}
