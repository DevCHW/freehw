package com.nemam.core.enums.point;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PointTrxType {

    CHARGE("Charge", "입금"), USE("Use", "출금");

    private final String value;

    private final String description;

}
