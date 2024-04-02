package com.nemam.storage.db.core.jpa.member.repository;

import com.nemam.storage.db.core.jpa.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberEntityJpaRepository extends JpaRepository<MemberEntity, Long> {

    MemberEntity findByEmailAndPassword(String email, String password);
}
