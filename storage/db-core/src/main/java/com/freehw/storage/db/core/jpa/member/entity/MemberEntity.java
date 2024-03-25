package com.freehw.storage.db.core.jpa.member.entity;

import com.freehw.core.enums.member.MemberRole;
import com.freehw.storage.db.core.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "member")
public class MemberEntity extends BaseEntity {

    @Comment("Primary Key")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("이메일")
    @Column(nullable = false, unique = true)
    private String email;

    @Comment("비밀번호")
    @Column(nullable = false)
    private String password;

    @Comment("회원 계정 활성 상태")
    @Column(nullable = false)
    private boolean active;

    @Comment("회원 이름")
    @Column(nullable = false)
    private String name;
    
    @Comment("회원 생년월일")
    private LocalDate birthDay;

    @Comment("권한")
    @Enumerated(EnumType.STRING)
    private MemberRole role;

    @Comment("마지막 비밀번호 업데이트 일자")
    private LocalDateTime lastModifyPasswordDate;

}
