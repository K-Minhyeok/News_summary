package com.study.news.service;

import com.study.news.entity.News;
import com.study.news.respository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
@Autowired
    private NewsRepository newsRepository;

    public void addToDB(News news){
        newsRepository.save(news);
    }

}
