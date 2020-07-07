package com.example.onlineshop.service.impl;

import com.example.onlineshop.mapper.OrderMapper;
import com.example.onlineshop.pojo.Order;
import com.example.onlineshop.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrderList(Map<String, Object> orderMap) { return orderMapper.getOrderList(orderMap); }

    @Override
    public int getCount(Map<String, Object> orderMap) {
        return orderMapper.getCount(orderMap);
    }

    @Override
    public Order getOrderByOrderId(Integer orderid) {
        return orderMapper.getOrderByOrderId(orderid);
    }

    @Override
    public int deleteOrder(Integer orderid) {
        return orderMapper.deleteOrder(orderid);
    }

    @Override
    public List<Order> getOrderByUserId(Integer userId) {
        return orderMapper.getOrderByUserId(userId);
    }

    @Override
    public List<Order> getOrderUnionListByOrderId(Integer orderid) { return orderMapper.getOrderUnionListByOrderId(orderid); }

    @Override
    public List<Order> getOrderUnionListByUserId(Integer userId) {
        return orderMapper.getOrderUnionListByUserId(userId);
    }
}
