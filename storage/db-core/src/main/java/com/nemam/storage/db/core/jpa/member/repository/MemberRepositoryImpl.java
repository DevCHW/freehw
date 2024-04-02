package com.nemam.storage.db.core.jpa.member.repository;

import com.nemam.core.domain.member.MemberRepository;
import com.nemam.core.domain.member.model.Member;
import com.nemam.storage.db.core.jpa.member.entity.MemberEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberRepositoryImpl implements MemberRepository {

    private final MemberEntityJpaRepository memberRepository;
    private final JPAQueryFactory queryFactory;

    @Override
    public Member findByEmailAndPassword(String email, String password) {
        MemberEntity memberEntity = memberRepository.findByEmailAndPassword(email, password);
        return Member.builder()
                .id(memberEntity.getId())
                .email(memberEntity.getEmail())
                .password(memberEntity.getPassword())
                .nickname(memberEntity.getNickname())
                .status(memberEntity.getStatus())
                .name(memberEntity.getName())
                .birthDay(memberEntity.getBirthDay())
                .gender(memberEntity.getGender())
                .activityScore(memberEntity.getActivityScore())
                .profileImageUrl(memberEntity.getProfileImageUrl())
                .role(memberEntity.getRole())
                .lastModifyPasswordDate(memberEntity.getLastModifyPasswordDate())
                .build();
    }
}
