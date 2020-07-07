package com.example.onlineshop.service;

import com.example.onlineshop.pojo.Car;

import java.util.List;
import java.util.Map;

public interface CarService {

    int deleteCar(Integer id);

    int addCar(Car car);

    Car selectCar(Integer id);

    int updateCar(Car car);

    List<Car> getCar(Map<String, Object> carMap);

    int getCount(Map<String, Object> carMap);

    List<Car>getCarListByUserId(Integer userId);
}
