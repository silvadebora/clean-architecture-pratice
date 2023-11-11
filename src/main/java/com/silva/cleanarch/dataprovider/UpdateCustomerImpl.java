package com.silva.cleanarch.dataprovider;

import com.silva.cleanarch.core.dataprovider.UpdateCustomer;
import com.silva.cleanarch.core.domain.Customer;
import com.silva.cleanarch.dataprovider.repository.CustomerRepository;
import com.silva.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
