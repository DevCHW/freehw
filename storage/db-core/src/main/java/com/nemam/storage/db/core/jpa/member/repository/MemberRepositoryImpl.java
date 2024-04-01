package com.nemam.storage.db.core.jpa.member.repository;

import com.nemam.core.domain.member.MemberRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {

    private final MemberEntityJpaRepository jpaRepository;

    private final JPAQueryFactory queryFactory;

}
