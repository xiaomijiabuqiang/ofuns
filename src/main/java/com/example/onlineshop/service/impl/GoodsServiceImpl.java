package com.example.onlineshop.service.impl;

import com.example.onlineshop.mapper.GoodsMapper;
import com.example.onlineshop.pojo.Goods;
import com.example.onlineshop.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> getGoodsList(Map<String, Object> goodsMap) {
        return goodsMapper.getGoodsList(goodsMap);
    }

    @Override
    public int getCount(Map<String, Object> goodsMap) {
        return goodsMapper.getCount(goodsMap);
    }

    @Override
    public int saveGoods(Goods goods) {
        return goodsMapper.saveGoods(goods);
    }

    @Override
    public int updateGoods(Goods goods) {
        return goodsMapper.updateGoods(goods);
    }

    @Override
    public Goods getGoods(Integer id) {
        return goodsMapper.getGoods(id);
    }

    @Override
    public int deleteGoods(Integer id) {
        return goodsMapper.deleteGoods(id);
    }

    @Override
    public int updateState(Map<String,Object> stateMap) {
        return goodsMapper.updateState(stateMap);
    }

    @Override
    public List<Goods> getGoodsByType(Integer typeId) { return goodsMapper.getGoodsByType(typeId); }
}
