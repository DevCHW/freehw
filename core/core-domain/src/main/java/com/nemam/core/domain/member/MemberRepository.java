package com.nemam.core.domain.member;

import com.nemam.core.domain.member.model.Member;

public interface MemberRepository {

    Member findByEmailAndPassword(String email, String password);
}
