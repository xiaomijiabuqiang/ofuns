package com.example.onlineshop.service.impl;

import com.example.onlineshop.mapper.CarouselMapper;
import com.example.onlineshop.pojo.Carousel;
import com.example.onlineshop.service.CarouselService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class CarouselServiceImpl implements CarouselService {
    @Resource
    private CarouselMapper carouselMapper;
    @Override
    public List<Carousel> getCarouselList(Map<String, Object> carouselMap) {
        return carouselMapper.getCarouselList(carouselMap);
    }

    @Override
    public int getCount(Map<String, Object> carouselMap) {
        return carouselMapper.getCount(carouselMap);
    }

    @Override
    public int saveCarousel(Carousel carousel) {
        return carouselMapper.saveCarousel(carousel);
    }

    @Override
    public int updateCarousel(Carousel carousel) {
        return carouselMapper.updateCarousel(carousel);
    }

    @Override
    public Carousel getCarousel(Integer id) {
        return carouselMapper.selectCarousel(id);
    }

    @Override
    public int deleteCarousel(Integer id) {
        return carouselMapper.deleteCarousel(id);
    }
}
