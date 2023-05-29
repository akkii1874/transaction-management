package com.trans.service;

import com.trans.entity.Address;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {
    public Address addAddress(Address address);
}
