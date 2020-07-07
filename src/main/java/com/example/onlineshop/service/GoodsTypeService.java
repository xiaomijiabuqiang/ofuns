package com.example.onlineshop.service;

import com.example.onlineshop.pojo.GoodsType;

import java.util.List;
import java.util.Map;

public interface GoodsTypeService {
    List<GoodsType> getGoodsTypeList(Map<String, Object> goodsTypeMap);

    int getCount(Map<String, Object> goodsTypeMap);

    int deleteGoodsType(Integer id);

    int addGoodsType(GoodsType goodsType);

    GoodsType getGoodsType(Integer id);

    int updateGoodsType(GoodsType goodsType);
}
