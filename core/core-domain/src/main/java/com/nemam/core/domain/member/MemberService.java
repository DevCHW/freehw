package com.nemam.core.domain.member;

import com.nemam.core.domain.member.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberReader memberReader;

    public Member getMember(String email, String password) {
        return memberReader.read(email, password);
    }

    public Member getMember(Long id) {
        return null;
    }

}
