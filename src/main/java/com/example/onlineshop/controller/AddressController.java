package com.example.onlineshop.controller;

import com.example.onlineshop.common.RespBean;
import com.example.onlineshop.pojo.Address;
import com.example.onlineshop.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/getByUserId",method = RequestMethod.GET)
    public List<Address> getAddressByUser(@RequestParam("userid") Integer userid){
        return addressService.getAddressByUser(userid);
    }
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public Map<String,Object> getAddressList(@RequestBody Map<String,Object> addressMap, Integer id){
        int count = addressService.getCount(addressMap);
        List<Address> addressList = addressService.getList(addressMap);
        Map<String,Object> returnMap = new HashMap<String, Object>();
        returnMap.put("count",count);
        returnMap.put("list",addressList);
        return returnMap;
    }
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public RespBean saveAddress(@RequestBody Address address){
        int result = 0;
        if(address.getId()==null){
            result = addressService.addAddress(address);
        }else {
            result = addressService.updateAddress(address);
        }
        if(result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Address getAddress(@RequestParam Integer id){
        return addressService.getAddress(id);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public RespBean deleteAddress(@RequestBody Integer id){
        int result =0;
        if (id==null){
            result = addressService.deleteAddress(id);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }
}
