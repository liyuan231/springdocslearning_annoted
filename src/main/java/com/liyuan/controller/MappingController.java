package com.liyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MappingController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
