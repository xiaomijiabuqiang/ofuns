package com.example.onlineshop.controller;

import com.example.onlineshop.common.RespBean;
import com.example.onlineshop.pojo.Order;
import com.example.onlineshop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public Map<String,Object> getOrderList(@RequestBody Map<String,Object> orderMap ){
        int count = orderService.getCount(orderMap);
        List<Order> orderList = orderService.getOrderList(orderMap);
        Map<String,Object> returnMap = new HashMap<String, Object>();
        returnMap.put("count",count);
        returnMap.put("list",orderList);
        return returnMap;
    }

    @RequestMapping(value = "/getByOrderId",method = RequestMethod.GET)
    public Order getOrderByOrderId(@RequestParam Integer orderid){
        return orderService.getOrderByOrderId(orderid);
    }

    @RequestMapping(value = "/getByUserId",method = RequestMethod.GET)
    public List<Order> getOrderByUserId(@RequestParam Integer userid){
        return orderService.getOrderByUserId(userid);
    }

    @RequestMapping(value = "/Unionlist",method = RequestMethod.POST)
    private List<Order> getOrderUnionListByOrderId(@RequestParam("orderid") Integer orderid){
        return orderService.getOrderUnionListByOrderId(orderid);
    }

    @RequestMapping(value = "/UnionlistByUserId",method = RequestMethod.POST)
    private List<Order> getOrderUnionListByUserId(@RequestParam("userid") Integer userid){
        return orderService.getOrderUnionListByUserId(userid);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public RespBean deleteOrder(@RequestBody Integer orderid){
        int result =0;
        if (orderid==null){
            result = orderService.deleteOrder(orderid);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }
}
