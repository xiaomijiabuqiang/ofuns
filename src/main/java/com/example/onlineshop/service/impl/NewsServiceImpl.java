package com.example.onlineshop.service.impl;

import com.example.onlineshop.mapper.NewsMapper;
import com.example.onlineshop.pojo.Goods;
import com.example.onlineshop.pojo.News;
import com.example.onlineshop.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class NewsServiceImpl implements NewsService {

    @Resource
    private NewsMapper newsMapper;
    @Override
    public List<News> getNewsList(Map<String, Object> newsMap) {
        return newsMapper.getNewsList(newsMap);
    }

    @Override
    public int getCount(Map<String, Object> newsMap) {
        return newsMapper.getCount(newsMap);
    }

    @Override
    public News getNews(Integer id) {
        return newsMapper.getNews(id);
    }
}
