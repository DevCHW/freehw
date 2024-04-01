package com.nemam.storage.db.core.jpa.point.entity;

import com.nemam.core.enums.point.PointStatus;
import com.nemam.storage.db.core.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "points")
public class PointEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long memberId;

    private Long amount;

    @Enumerated(EnumType.STRING)
    private PointStatus status;

    private LocalDateTime expiredAt;

}
