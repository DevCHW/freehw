package com.freehw.storage.db.core.jpa.member.repository;

import com.freehw.storage.db.core.jpa.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberEntityJpaRepository extends JpaRepository<MemberEntity, Long> {
}
