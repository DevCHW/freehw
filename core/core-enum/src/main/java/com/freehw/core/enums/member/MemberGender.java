package com.freehw.core.enums.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemberGender {

    MAN("Man", "남자"), WOMEN("Women", "여자"), UNKNOWN("Unknown", "알 수 없음");

    private final String value;

    private final String description;

}
