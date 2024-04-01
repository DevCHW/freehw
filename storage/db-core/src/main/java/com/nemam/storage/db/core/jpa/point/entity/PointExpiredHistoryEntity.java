package com.nemam.storage.db.core.jpa.point.entity;

import com.nemam.storage.db.core.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "point_expired_history")
public class PointExpiredHistoryEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long memberId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "point_id")
    private PointEntity point;

}
