package com.nemam.core.domain.login;

import com.nemam.core.domain.member.client.MemberClient;
import com.nemam.core.domain.member.client.model.MemberInfo;
import com.nemam.core.utils.AesUtil;
import com.nemam.support.CreateTokenParam;
import com.nemam.support.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginReader loginReader;
    private final LoginWriter loginWriter;

    private final MemberClient memberClient;

    /**
     * 로그인
     * 토큰 반환
     */
    public String login(Login login) {
        String password = AesUtil.encrypt(login.getPassword(), login.getEmail());
        MemberInfo memberInfo = memberClient.getMember(login.getEmail(), password);
        CreateTokenParam tokenParam = CreateTokenParam.builder()
                .id(memberInfo.getId())
                .email(memberInfo.getEmail())
                .name(memberInfo.getName())
                .nickname(memberInfo.getNickname())
                .role(memberInfo.getRole().name())
                .build();
        return JwtUtil.createToken(tokenParam, login.getTokenSecretKey(), login.getTokenExpiredMs());
    }

}
