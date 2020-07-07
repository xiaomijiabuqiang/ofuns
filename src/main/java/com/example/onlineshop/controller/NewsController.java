package com.example.onlineshop.controller;

import com.example.onlineshop.pojo.Goods;
import com.example.onlineshop.pojo.News;
import com.example.onlineshop.service.GoodsService;
import com.example.onlineshop.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/portal/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public Map<String,Object> getNewsList(@RequestBody Map<String,Object> newsMap, HttpServletRequest request ){
        HttpSession session = request.getSession();
        int count = newsService.getCount(newsMap);
        List<News> newsList = newsService.getNewsList(newsMap);
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("count",count);
        returnMap.put("list",newsList);
        session.setAttribute("returnMap",returnMap);
        return returnMap;
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public News getNewsById(@RequestParam Integer id){
        return newsService.getNews(id);
    }

}
