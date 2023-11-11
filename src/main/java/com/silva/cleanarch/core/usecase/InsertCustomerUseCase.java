package com.silva.cleanarch.core.usecase;

import com.silva.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
