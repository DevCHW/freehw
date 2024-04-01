package com.freehw.storage.db.core.jpa.member.entity;

import com.freehw.storage.db.core.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "member_profile_image")
public class MemberProfileImageHistoryEntity extends BaseEntity {

    @Comment("Primary Key")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("프로필 이미지 url")
    @Column(unique = true)
    private String profileImageUrl;

    @Comment("회원 ID (FK)")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private MemberEntity member;

    @Comment("활성 여부")
    private boolean active;

}
