package com.example.onlineshop.service;

import com.example.onlineshop.pojo.OrderDetail;

import java.util.List;
import java.util.Map;

public interface OrderDetailService {

    List<OrderDetail> getOrderDetailList(Map<String, Object> orderDetailMap);

    int getCount(Map<String, Object> orderDetailMap);

    OrderDetail getOrderDetail(Integer id);

    List<OrderDetail> getOrderDetailByOrderId(Integer orderid);

    int addOrderDetail(OrderDetail orderDetail);

    int updateOrderDetail(OrderDetail orderDetail);

    int deleteOrderDetail(Integer id);
}
