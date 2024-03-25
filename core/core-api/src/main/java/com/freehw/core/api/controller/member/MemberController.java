package com.freehw.core.api.controller.member;

import com.freehw.core.api.controller.member.response.MemberResponse;
import com.freehw.core.api.support.response.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    @GetMapping("/members/{memberId}")
    public ApiResponse<MemberResponse> member(@PathVariable("memberId") Long memberId) {
        return null;
//        return ApiResponse.success();
    }

}
