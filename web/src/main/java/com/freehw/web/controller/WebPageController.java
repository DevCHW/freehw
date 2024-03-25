package com.freehw.web.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class WebPageController {

    @GetMapping("/")
    public String hello() {
        return "index.html";
    }

}
