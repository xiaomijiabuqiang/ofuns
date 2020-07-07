package com.example.onlineshop.service.impl;

import com.example.onlineshop.mapper.OrderDetailMapper;
import com.example.onlineshop.pojo.OrderDetail;
import com.example.onlineshop.service.OrderDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Resource
    private OrderDetailMapper orderDetailMapper;
    @Override
    public List<OrderDetail> getOrderDetailList(Map<String, Object> orderDetailMap) {
        return orderDetailMapper.getOrderDetailList(orderDetailMap);
    }

    @Override
    public int getCount(Map<String, Object> orderDetailMap) {
        return orderDetailMapper.getCount(orderDetailMap);
    }

    @Override
    public OrderDetail getOrderDetail(Integer id) {
        return orderDetailMapper.getOrderDetail(id);
    }

    @Override
    public List<OrderDetail> getOrderDetailByOrderId(Integer orderid) {
        return orderDetailMapper.getOrderDetailByOrderId(orderid);
    }

    @Override
    public int addOrderDetail(OrderDetail orderDetail) {
        return orderDetailMapper.addOrderDetail(orderDetail);
    }

    @Override
    public int updateOrderDetail(OrderDetail orderDetail) {
        return orderDetailMapper.updateOrderDetail(orderDetail);
    }

    @Override
    public int deleteOrderDetail(Integer id) {
        return orderDetailMapper.deleteOrderDetail(id);
    }
}
