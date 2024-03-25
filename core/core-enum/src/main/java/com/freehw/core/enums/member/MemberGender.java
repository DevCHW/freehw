package com.freehw.core.enums.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemberGender {
    MAN("Man"),
    WOMEN("Women"),
    UNKNOWN("Unknown");

    private final String description;
}
