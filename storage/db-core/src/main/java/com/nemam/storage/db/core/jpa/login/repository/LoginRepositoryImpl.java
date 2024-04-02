package com.nemam.storage.db.core.jpa.login.repository;

import com.nemam.core.domain.login.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LoginRepositoryImpl implements LoginRepository {

    private final LoginHistoryEntityRepository loginHistoryRepository;

}
