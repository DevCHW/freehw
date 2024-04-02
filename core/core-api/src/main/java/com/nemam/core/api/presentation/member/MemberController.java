package com.nemam.core.api.presentation.member;

import com.nemam.core.api.presentation.member.request.CreateMemberRequest;
import com.nemam.core.api.presentation.member.response.CreateMemberResponse;
import com.nemam.core.api.presentation.member.response.MemberResponse;
import com.nemam.core.api.support.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    /**
     * 회원 생성
     */
    @PostMapping("/api/v1/members")
    public ApiResponse<CreateMemberResponse> member(@RequestBody CreateMemberRequest request) {
        return null;
        // return ApiResponse.success();
    }

    /**
     * 회원 탈퇴
     */
    @DeleteMapping("/api/v1/members/{memberId}")
    public ApiResponse<MemberResponse> deleteMember(@PathVariable("memberId") Long memberId) {
        return null;
        // return ApiResponse.success();
    }

    /**
     * 회원 목록 조회
     */
    @GetMapping("/api/v1/members")
    public ApiResponse<List<MemberResponse>> getMembers() {
        return null;
        // return ApiResponse.success();
    }

    /**
     * 회원 상세 조회
     */
    @GetMapping("/api/v1/members/{memberId}")
    public ApiResponse<MemberResponse> getMemberOne(@PathVariable("memberId") Long memberId) {
        return null;
        // return ApiResponse.success();
    }

}
