package com.silva.cleanarch.dataprovider;

import com.silva.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.silva.cleanarch.core.domain.Address;
import com.silva.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.silva.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
