package com.silva.cleanarch.dataprovider.repository.mapper;

import com.silva.cleanarch.core.domain.Customer;
import com.silva.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
