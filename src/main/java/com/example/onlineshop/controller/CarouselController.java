package com.example.onlineshop.controller;

import com.example.onlineshop.common.RespBean;
import com.example.onlineshop.pojo.Carousel;
import com.example.onlineshop.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/portal/carousel")
public class CarouselController {

    @Autowired
    private CarouselService carouselService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Map<String, Object> getCarouselList(@RequestBody Map<String, Object> carouselMap) {
        int count = carouselService.getCount(carouselMap);
        List<Carousel> carouselList = carouselService.getCarouselList(carouselMap);
        Map<String, Object> returnMap = new HashMap<String, Object>();
        returnMap.put("count", count);
        returnMap.put("list", carouselList);
        return returnMap;
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public RespBean saveCarousel(@RequestBody Carousel carousel){
        int result =0;
        if (carousel.getId()==null){
            result = carouselService.saveCarousel(carousel);
        }else {
            result = carouselService.updateCarousel(carousel);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Carousel getGoodsById(@RequestParam Integer id){
        return carouselService.getCarousel(id);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public RespBean deleteCarousel(@RequestBody Integer id){
        int result =0;
        if (id==null){
            result = carouselService.deleteCarousel(id);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }
}
