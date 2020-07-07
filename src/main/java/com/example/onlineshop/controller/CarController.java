package com.example.onlineshop.controller;

import com.example.onlineshop.common.RespBean;
import com.example.onlineshop.pojo.Car;
import com.example.onlineshop.service.CarService;
import com.example.onlineshop.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/getByUser",method = RequestMethod.GET)
    public ResponseData getCarListByUserId(@RequestParam("userid") Integer userid){
        ResponseData responseData = ResponseData.ok();
        responseData.putDataValue("shoppingCartData",carService.getCarListByUserId(userid));
        responseData.putDataValue("msg","ok");
        return responseData;
    }
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public Map<String,Object> getCarList(@RequestBody Map<String,Object> carMap,Integer id){
        int count = carService.getCount(carMap);
        List<Car> carList = carService.getCar(carMap);
        Map<String,Object> returnMap = new HashMap<String, Object>();
        returnMap.put("count",count);
        returnMap.put("list",carList);
        return returnMap;
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveCar(@RequestBody Car car,HttpServletResponse response) throws IOException {
//        System.out.println(car.toString());
        ResponseData responseData=null;
        int result = 0;
        if(car.getId()==null){
            result = carService.addCar(car);
        }else {
            result = carService.updateCar(car);
        }
        if(result > 0){
//            return "redirect:getByUser?userid="+car.getUserid();
            response.sendRedirect("getByUser?userid="+car.getUserid());
        }
        return new RespBean("error","操作失败").toString();
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Car getCar(@RequestParam Integer id){
        return carService.selectCar(id);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public RespBean deleteUser(@RequestBody Integer id){
        int result =0;
        if (id==null){
            result = carService.deleteCar(id);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }
}
