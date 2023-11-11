package com.silva.cleanarch.core.usecase.impl;

import com.silva.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.silva.cleanarch.core.dataprovider.InsertCustomer;
import com.silva.cleanarch.core.domain.Customer;
import com.silva.cleanarch.core.usecase.InsertCustomerUseCase;


public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    //não foi usado @Autowired, pois no core não é ideal usar frameworks
    private final FindAddressByZipCode findAddressByZipCode;

    private final InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode,
                                     InsertCustomer insertCustomer){
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
    }
}
