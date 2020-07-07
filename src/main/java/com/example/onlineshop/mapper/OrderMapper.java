package com.example.onlineshop.mapper;

import com.example.onlineshop.pojo.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    List<Order> getOrderList(Map<String, Object> orderMap);

    int getCount(Map<String, Object> orderMap);

    Order getOrderByOrderId(Integer orderid);

    int deleteOrder(Integer id);

    List<Order> getOrderByUserId(Integer userId);

    List<Order> getOrderUnionListByOrderId(Integer orderid);

    List<Order> getOrderUnionListByUserId(Integer userid);
}