package com.freehw.core.enums.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemberRole {

    SUPER("Super"), USER("User"), ADMIN("Admin");

    private final String value;

}
