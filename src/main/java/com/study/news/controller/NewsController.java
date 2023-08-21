package com.study.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewsController {
@GetMapping("news/choose")
    public String chooseNewsInfo(){

    return "chooseNews";

    }
@PostMapping("news/result")
    public String resultOfNews(){

    return "resultOfNews";
    }

}
