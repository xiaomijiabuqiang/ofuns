package com.example.onlineshop.mapper;

import com.example.onlineshop.pojo.OrderDetail;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderDetailMapper {

    List<OrderDetail> getOrderDetailList(Map<String, Object> orderDetailMap);

    int getCount(Map<String, Object> orderDetailMap);

    OrderDetail getOrderDetail(Integer id);

    List<OrderDetail> getOrderDetailByOrderId(Integer orderid);

    int addOrderDetail(OrderDetail orderDetail);

    int updateOrderDetail(OrderDetail orderDetail);

    int deleteOrderDetail(Integer id);
}