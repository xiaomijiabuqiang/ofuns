package com.example.onlineshop.controller;

import com.example.onlineshop.common.RespBean;
import com.example.onlineshop.pojo.Goods;
import com.example.onlineshop.service.GoodsService;
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
@RequestMapping("/portal/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public Map<String,Object> getGoodsList(@RequestBody Map<String,Object> goodsMap, HttpServletRequest request ){
        HttpSession session = request.getSession();
        System.out.println("+++++\n"+goodsMap);
        int count = goodsService.getCount(goodsMap);
        List<Goods> goodsList = goodsService.getGoodsList(goodsMap);
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("count",count);
        returnMap.put("list",goodsList);
        session.setAttribute("returnMap",returnMap);
        return returnMap;
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public RespBean saveGoods(@RequestBody Goods goods){
        int result =0;
        if (goods.getId()==null){
            goods.setCreateTime(new Date());
            result = goodsService.saveGoods(goods);
        }else {
            result = goodsService.updateGoods(goods);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Goods getGoodsById(@RequestParam Integer id){
        return goodsService.getGoods(id);
    }

    @RequestMapping(value = "/getByType",method = RequestMethod.POST)
    public List<Goods> getGoodsByType(@RequestParam Integer typeId){
        return goodsService.getGoodsByType(typeId);
    }

    @RequestMapping(value = "/state",method = RequestMethod.POST)
    public RespBean updateState(@RequestBody Map<String,Object> stateMap){
        int result = 0;
        result = goodsService.updateState(stateMap);
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public RespBean deleteGoods(@RequestBody Integer id){
        int result =0;
        if (id==null){
            result = goodsService.deleteGoods(id);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }
}
