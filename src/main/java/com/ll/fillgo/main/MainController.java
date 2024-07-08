package com.ll.fillgo.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/FillGo")
public class MainController {
    @GetMapping("/main")
    public String test() {
        return "main";
    }
}
