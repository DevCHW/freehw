package com.nemam.storage.db.core.jpa.login.repository;

import com.nemam.storage.db.core.jpa.login.entity.LoginHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginHistoryEntityRepository extends JpaRepository<LoginHistoryEntity, Long> {
}
