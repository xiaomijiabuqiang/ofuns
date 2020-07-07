package com.example.onlineshop.mapper;

import com.example.onlineshop.pojo.Goods;
import com.example.onlineshop.pojo.News;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface NewsMapper {

    List<News> getNewsList(Map<String, Object> newsMap);

    int getCount(Map<String, Object> newsMap);

    News getNews(Integer id);

}
