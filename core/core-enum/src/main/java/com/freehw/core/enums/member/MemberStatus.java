package com.freehw.core.enums.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemberStatus {
    ACTIVE("Active", "활성"),
    INACTIVE("Inactive", "비활성"),
    SUSPENDED("Suspended", "정지"),
    WITHDRAWN("Withdrawn", "탈퇴"),
    BLOCKED("blocked", "차단");

    private final String value;
    private final String description;
}
