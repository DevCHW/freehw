package com.nemam.storage.db.core.jpa.member.entity;

import com.nemam.storage.db.core.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "member_login_history")
public class MemberLoginHistoryEntity extends BaseEntity {

    @Comment("Primary Key")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("로그인 IP주소")
    private String loginIp;

}
