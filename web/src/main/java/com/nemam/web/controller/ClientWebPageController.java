package com.nemam.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ClientWebPageController {

    @GetMapping("/")
    public String hello() {
        return "client/index.html";
    }

    @GetMapping("/login")
    public String login() {
        return "client/member/login.html";
    }

    @GetMapping("/signUp")
    public String signup() {
        return "client/member/signUp.html";
    }

    @GetMapping("/member/{memberId}")
    public String myPage(@PathVariable Long memberId) {
        return "client/member/myPage.html";
    }

}
