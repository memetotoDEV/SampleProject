package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Sample Project");
        model.addAttribute("message", "Spring Bootで作成した簡単なWebサイトです！");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About");
        model.addAttribute("message", "このサイトについて");
        model.addAttribute("description", "Spring BootとThymeleafを使用して作成されたシンプルなWebアプリケーションです。");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact");
        model.addAttribute("message", "お問い合わせ");
        return "contact";
    }
}
