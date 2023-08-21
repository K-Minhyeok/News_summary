package com.study.news.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.study.news.entity.News;

@Repository
public interface NewsRepository extends JpaRepository<News,Integer> {

}
