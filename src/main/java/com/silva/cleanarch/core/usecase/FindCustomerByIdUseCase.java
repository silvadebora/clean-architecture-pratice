package com.silva.cleanarch.core.usecase;

import com.silva.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
