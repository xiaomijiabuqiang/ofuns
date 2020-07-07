package com.example.onlineshop.service;

import com.example.onlineshop.pojo.Goods;
import com.example.onlineshop.pojo.News;

import java.util.List;
import java.util.Map;

public interface NewsService {
    List<News> getNewsList(Map<String, Object> newsMap);

    int getCount(Map<String, Object> newsMap);

    News getNews(Integer id);
}
