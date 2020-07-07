package com.example.onlineshop.service.impl;

import com.example.onlineshop.mapper.CarMapper;
import com.example.onlineshop.pojo.Car;
import com.example.onlineshop.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class CarServiceImpl implements CarService {

    @Resource
    private CarMapper carMapper;

    @Override
    public int deleteCar(Integer id) {
        return carMapper.deleteCar(id);
    }

    @Override
    public int addCar(Car car) {
        return carMapper.addCar(car);
    }

    @Override
    public Car selectCar(Integer id) {
        return carMapper.selectCar(id);
    }

    @Override
    public int updateCar(Car car) {
        return carMapper.updateCar(car);
    }

    @Override
    public List<Car> getCar(Map<String, Object> carMap) {
        return carMapper.getCarList(carMap);
    }

    @Override
    public int getCount(Map<String, Object> carMap) {
        return carMapper.getCount(carMap);
    }

    @Override
    public List<Car> getCarListByUserId(Integer userid) {
        return carMapper.getCarListByUserId(userid);
    }
}
