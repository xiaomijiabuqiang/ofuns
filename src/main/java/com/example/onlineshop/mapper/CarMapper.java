package com.example.onlineshop.mapper;

import com.example.onlineshop.pojo.Car;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface CarMapper {

    List<Car> getCarList(Map<String, Object> carMap);

    int getCount(Map<String, Object> carMap);

    Car selectCar(Integer id);

    int addCar(Car car);

    int updateCar(Car car);

    int deleteCar(Integer id);

    List<Car>getCarListByUserId(Integer userid);
}