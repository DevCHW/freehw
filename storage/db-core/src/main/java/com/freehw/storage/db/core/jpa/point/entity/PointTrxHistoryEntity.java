package com.freehw.storage.db.core.jpa.point.entity;

import com.freehw.core.enums.point.PointTrxType;
import com.freehw.storage.db.core.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "point_trx_history")
public class PointTrxHistoryEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private PointTrxType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "point_id")
    private PointEntity point;

    private String description;

}
