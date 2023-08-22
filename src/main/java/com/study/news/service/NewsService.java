package com.study.news.service;

import com.study.news.entity.News;
import com.study.news.respository.NewsRepository;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
@Autowired
    private NewsRepository newsRepository;

    public void addInfoToDB(News news){

        newsRepository.save(news);

    }

    public void addContToDB(News news) throws  Exception{
        String URL = "https://www.yna.co.kr/economy/all?site=navi_economy_depth02";

        Document doc = Jsoup.connect(URL).get();

        doc.text();

        Elements elem = doc.select("lead");


        System.out.println(elem);


    }

}
