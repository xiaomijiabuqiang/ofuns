package com.example.onlineshop.controller;

import com.example.onlineshop.common.RespBean;
import com.example.onlineshop.pojo.OrderDetail;
import com.example.onlineshop.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/orderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @RequestMapping(value = "/getByOrderId",method = RequestMethod.GET)
    public List<OrderDetail> getOrderDetailListByUserId(@RequestParam("orderid") Integer orderid){
        return orderDetailService.getOrderDetailByOrderId(orderid);
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public Map<String,Object> getOrderDetailList(@RequestBody Map<String,Object> orderDetailMap, Integer id){
        int count = orderDetailService.getCount(orderDetailMap);
        List<OrderDetail> orderDetailList = orderDetailService.getOrderDetailList(orderDetailMap);
        Map<String,Object> returnMap = new HashMap<String, Object>();
        returnMap.put("count",count);
        returnMap.put("list",orderDetailList);
        return returnMap;
    }
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public RespBean saveOrderDetail(@RequestBody OrderDetail orderDetail){
        int result = 0;
        if(orderDetail.getId()==null){
            result = orderDetailService.addOrderDetail(orderDetail);
        }else {
            result = orderDetailService.updateOrderDetail(orderDetail);
        }
        if(result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public OrderDetail getOrderDetail(@RequestParam Integer id){
        return orderDetailService.getOrderDetail(id);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public RespBean deleteOrderDetail(@RequestBody Integer id){
        int result =0;
        if (id==null){
            result = orderDetailService.deleteOrderDetail(id);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }
}
