package com.nemam.core.domain.login.model;

import com.nemam.core.domain.member.client.model.MemberInfo;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Getter
public class LoginMember {
    private Long id;
    private String email;
    private String role;

    @Builder(access = AccessLevel.PRIVATE)
    public LoginMember(Long id, String email, String role) {
        this.id = id;
        this.email = email;
        this.role = role;
    }

    public static LoginMember of(Long id, String email, String password, String role) {
        return LoginMember.builder()
                .id(id)
                .email(email)
                .role(role)
                .build();
    }

    public static LoginMember from(MemberInfo memberInfo) {
        return LoginMember.builder()
                .id(memberInfo.getId())
                .email(memberInfo.getEmail())
                .role(memberInfo.getRole().name())
                .build();
    }

}
