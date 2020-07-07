package com.example.onlineshop.service;

import com.example.onlineshop.pojo.Carousel;

import java.util.List;
import java.util.Map;

public interface CarouselService {
    List<Carousel> getCarouselList(Map<String, Object> carouselMap);

    int getCount(Map<String, Object> carouselMap);

    int saveCarousel(Carousel carousel);

    int updateCarousel(Carousel carousel);

    Carousel getCarousel(Integer id);

    int deleteCarousel(Integer id);
}
