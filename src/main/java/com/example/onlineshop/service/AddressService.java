package com.example.onlineshop.service;

import com.example.onlineshop.pojo.Address;

import java.util.List;
import java.util.Map;

public interface AddressService {

    List<Address> getList(Map<String, Object> addressMap);

    int getCount(Map<String, Object> addressMap);

    Address getAddress(Integer id);

    List<Address> getAddressByUser(Integer userid);

    int addAddress(Address address);

    int updateAddress(Address address);

    int deleteAddress(Integer id);
}
