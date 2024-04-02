package com.nemam.core.domain.member.model;

import com.nemam.core.enums.member.MemberGender;
import com.nemam.core.enums.member.MemberRole;
import com.nemam.core.enums.member.MemberStatus;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class Member {
    private Long id;
    private String email;
    private String password;
    private String nickname;
    private MemberStatus status;
    private String name;
    private LocalDate birthDay;
    private MemberGender gender;
    private Long activityScore;
    private String profileImageUrl;
    private MemberRole role;
    private LocalDateTime lastModifyPasswordDate;

    @Builder
    public Member(Long id, String email, String password, String nickname, MemberStatus status, String name, LocalDate birthDay, MemberGender gender, Long activityScore, String profileImageUrl, MemberRole role, LocalDateTime lastModifyPasswordDate) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.status = status;
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.activityScore = activityScore;
        this.profileImageUrl = profileImageUrl;
        this.role = role;
        this.lastModifyPasswordDate = lastModifyPasswordDate;
    }

}
