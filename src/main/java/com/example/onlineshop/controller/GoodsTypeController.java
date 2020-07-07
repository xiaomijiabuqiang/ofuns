package com.example.onlineshop.controller;

import com.example.onlineshop.common.RespBean;
import com.example.onlineshop.pojo.GoodsType;
import com.example.onlineshop.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/goodsType")
public class GoodsTypeController {
    @Autowired
    private GoodsTypeService goodsTypeService;

    @RequestMapping("/list")
    public Map<String,Object> getGoodsTypeList(Map<String,Object> goodsTypeMap){
        int count = goodsTypeService.getCount(goodsTypeMap);
        List<GoodsType> goodsTypeList = goodsTypeService.getGoodsTypeList(goodsTypeMap);
        Map<String,Object> returnMap = new HashMap<String, Object>();
        returnMap.put("count",count);
        returnMap.put("list",goodsTypeList);
        return returnMap;
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public RespBean saveGoodsType(@RequestBody GoodsType goodsType){
        int result =0;
        if (goodsType.getId()==null){
            result = goodsTypeService.addGoodsType(goodsType);
        }else {
            result = goodsTypeService.updateGoodsType(goodsType);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }

    @RequestMapping(value = "/getGoodsById",method = RequestMethod.GET)
    public GoodsType getGoodsType(@RequestParam Integer id){

        return goodsTypeService.getGoodsType(id);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public RespBean deleteGoodsType(@RequestBody Integer id){
        int result =0;
        if (id==null){
            result = goodsTypeService.deleteGoodsType(id);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }

}
