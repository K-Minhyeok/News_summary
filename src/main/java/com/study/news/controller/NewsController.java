package com.study.news.controller;

import com.study.news.entity.News;
import com.study.news.respository.NewsRepository;
import com.study.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewsController {
@Autowired
    private NewsService newsService;
@GetMapping("news/choose")
    public String chooseNewsInfo(){

    return "chooseNews";

    }
@PostMapping("news/result")
    public String resultOfNews(News news) throws  Exception{

    newsService.addContToDB();

    return "resultOfNews";
    }

}
