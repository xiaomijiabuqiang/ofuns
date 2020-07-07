package com.example.onlineshop.mapper;

import com.example.onlineshop.pojo.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface GoodsMapper {

    List<Goods> getGoodsList(Map<String, Object> goodsMap);

    int getCount(Map<String, Object> goodsMap);

    int deleteGoods(Integer id);

    int saveGoods(Goods goods);

    Goods getGoods(Integer id);

    int updateGoods(Goods goods);

    int updateState(Map<String, Object> stateMap);

    List<Goods> getGoodsByType(Integer typeId);
}
