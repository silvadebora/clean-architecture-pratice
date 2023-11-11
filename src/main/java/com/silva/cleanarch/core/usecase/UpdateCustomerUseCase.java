package com.silva.cleanarch.core.usecase;

import com.silva.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);
}
