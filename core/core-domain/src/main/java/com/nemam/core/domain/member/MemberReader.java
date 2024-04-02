package com.nemam.core.domain.member;

import com.nemam.core.domain.member.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberReader {

    private final MemberRepository memberRepository;

    public Member read(String email, String password) {
        return memberRepository.findByEmailAndPassword(email, password);
    }
}
