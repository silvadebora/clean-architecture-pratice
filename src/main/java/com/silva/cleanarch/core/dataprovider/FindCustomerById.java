package com.silva.cleanarch.core.dataprovider;

import com.silva.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(final String id);
}
