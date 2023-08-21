package com.study.news.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.study.news.entity.news;

@Repository

public interface NewsRepository extends JpaRepository<news,Integer> {

}
