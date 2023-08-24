package com.study.news.service;

import com.study.news.entity.News;
import com.study.news.respository.NewsRepository;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class NewsService {
@Autowired
    private NewsRepository newsRepository;

//    public void addInfoToDB(News news){
//
//        newsRepository.save(news);
//
//    }

    public void addContToDB() throws  Exception{
        String URL = "https://www.yna.co.kr/economy/all?site=navi_economy_depth02";

        Document doc = Jsoup.connect(URL).get();
        Elements elem = doc.select("div[class=\"news-con\"]");

        int count=1;

        for(Element e:elem.select("div[class=\"news-con\"]")){
            News news = new News();

            System.out.print(count+" 제목: " + e.select("strong[class=\"tit-news\"]").text());
            System.out.println("   || 내용 : "+e.select("p[class=\"lead\"]").text());

            //e.text()를 DB에 넣기
            news.setContent(e.select("p[class=\"lead\"]").text());
            newsRepository.save(news);
//            news.setId(null);

            count++;

            //10개만 출력
            if(count==11){
                break;
            }

        }



    }

}
