package com.nemam.core.domain.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Transactional
public class LoginWriter {

    private final LoginRepository loginRepository;
}
