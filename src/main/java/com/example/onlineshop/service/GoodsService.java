package com.example.onlineshop.service;

import com.example.onlineshop.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsService {

    List<Goods> getGoodsList(Map<String, Object> goodsMap);

    int getCount(Map<String, Object> goodsMap);

    int saveGoods(Goods goods);

    int updateGoods(Goods goods);

    Goods getGoods(Integer id);

    int deleteGoods(Integer id);

    int updateState(Map<String, Object> stateMap);

    List<Goods> getGoodsByType(Integer typeId);
}
