package com.example.onlineshop.service.impl;

import com.example.onlineshop.mapper.GoodsTypeMapper;
import com.example.onlineshop.pojo.GoodsType;
import com.example.onlineshop.service.GoodsTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Resource
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public List<GoodsType> getGoodsTypeList(Map<String,Object> goodsTypeMap) {
        return goodsTypeMapper.getGoodsTypeList(goodsTypeMap);
    }

    @Override
    public int getCount(Map<String, Object> goodsTypeMap) {
        return goodsTypeMapper.getCount(goodsTypeMap);
    }

    @Override
    public int deleteGoodsType(Integer id) {
        return goodsTypeMapper.deleteGoodsType(id);
    }

    @Override
    public int addGoodsType(GoodsType goodsType) {
        return goodsTypeMapper.addGoodsType(goodsType);
    }

    @Override
    public GoodsType getGoodsType(Integer id) {
        return goodsTypeMapper.getGoodsType(id);
    }

    @Override
    public int updateGoodsType(GoodsType goodsType) {
        return goodsTypeMapper.updateGoodsType(goodsType);
    }
}
