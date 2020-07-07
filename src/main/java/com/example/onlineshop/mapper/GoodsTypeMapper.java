package com.example.onlineshop.mapper;

import com.example.onlineshop.pojo.GoodsType;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface GoodsTypeMapper {

    List<GoodsType> getGoodsTypeList(Map<String, Object> goodsTypeMap);

    int getCount(Map<String, Object> goodsTypeMap);

    int deleteGoodsType(Integer id);

    int addGoodsType(GoodsType goodsType);

    GoodsType getGoodsType(Integer id);

    int updateGoodsType(GoodsType goodsType);
}