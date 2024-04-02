package com.nemam.support;

import lombok.Builder;
import lombok.Getter;

@Getter
public class CreateTokenParam {
    private Long id;
    private String email;
    private String name;
    private String nickname;
    private String role;

    @Builder
    public CreateTokenParam(Long id, String email, String name, String nickname, String role) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.nickname = nickname;
        this.role = role;
    }
}
