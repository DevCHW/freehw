package com.nemam.core.domain.member.client.model;

import com.nemam.core.enums.member.MemberGender;
import com.nemam.core.enums.member.MemberRole;
import com.nemam.core.enums.member.MemberStatus;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class MemberInfo {

    private final Long id;
    private final String email;
    private final String nickname;
    private final MemberStatus status;
    private final String name;
    private final LocalDate birthDay;
    private final MemberGender gender;
    private final Long activityScore;
    private final String profileImageUrl;
    private final MemberRole role;
    private final LocalDateTime lastModifyPasswordDate;

    @Builder
    public MemberInfo(Long id, String email, String nickname, MemberStatus status, String name, LocalDate birthDay, MemberGender gender, Long activityScore, String profileImageUrl, MemberRole role, LocalDateTime lastModifyPasswordDate) {
        this.id = id;
        this.email = email;
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
