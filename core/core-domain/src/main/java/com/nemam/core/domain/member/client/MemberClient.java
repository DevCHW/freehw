package com.nemam.core.domain.member.client;

import com.nemam.core.domain.member.MemberReader;
import com.nemam.core.domain.member.MemberService;
import com.nemam.core.domain.member.client.model.MemberInfo;
import com.nemam.core.domain.member.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberClient {

    private final MemberService memberService;

    public MemberInfo getMember(String email, String password) {
        Member member = memberService.getMember(email, password);
        return MemberInfo.builder()
                .id(member.getId())
                .email(member.getEmail())
                .nickname(member.getNickname())
                .status(member.getStatus())
                .name(member.getName())
                .birthDay(member.getBirthDay())
                .gender(member.getGender())
                .activityScore(member.getActivityScore())
                .profileImageUrl(member.getProfileImageUrl())
                .role(member.getRole())
                .lastModifyPasswordDate(member.getLastModifyPasswordDate())
                .build();
    }

}
