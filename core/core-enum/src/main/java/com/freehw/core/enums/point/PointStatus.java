package com.freehw.core.enums.point;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PointStatus {

    ACTIVE("Active", "활성"), INACTIVE("Inactive", "비활성"), EXPIRED("Expired", "만료");

    private final String value;

    private final String description;

}
