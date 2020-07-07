package com.example.onlineshop.service;

import com.example.onlineshop.pojo.Order;

import java.util.List;
import java.util.Map;

public interface OrderService {
    List<Order> getOrderList(Map<String, Object> orderMap);

    int getCount(Map<String, Object> orderMap);

    Order getOrderByOrderId(Integer orderid);

    int deleteOrder(Integer orderid);

    List<Order> getOrderByUserId(Integer userId);

    List<Order> getOrderUnionListByOrderId(Integer orderid);

    List<Order> getOrderUnionListByUserId(Integer userId);
}
