package com.example.onlineshop.service.impl;

import com.example.onlineshop.mapper.AddressMapper;
import com.example.onlineshop.pojo.Address;
import com.example.onlineshop.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressMapper addressMapper;

    @Override
    public List<Address> getList(Map<String, Object> addressMap) {
        return addressMapper.getList(addressMap);
    }

    @Override
    public int getCount(Map<String, Object> addressMap) {
        return addressMapper.getCount(addressMap);
    }

    @Override
    public List<Address> getAddressByUser(Integer userid) {
        return addressMapper.getAddressByUser(userid);
    }

    @Override
    public Address getAddress(Integer id) {
        return addressMapper.getAddress(id);
    }

    @Override
    public int addAddress(Address address) {
        return addressMapper.addAddress(address);
    }

    @Override
    public int updateAddress(Address address) {
        return addressMapper.updateAddress(address);
    }

    @Override
    public int deleteAddress(Integer id) {
        return addressMapper.deleteAddress(id);
    }
}
