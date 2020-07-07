package com.example.onlineshop.mapper;

import com.example.onlineshop.pojo.Carousel;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface CarouselMapper {

    List<Carousel> getCarouselList(Map<String, Object> carouselMap);

    int getCount(Map<String, Object> carouselMap);

    int saveCarousel(Carousel carousel);

    int updateCarousel(Carousel carousel);

    Carousel selectCarousel(Integer id);

    int deleteCarousel(Integer id);
}