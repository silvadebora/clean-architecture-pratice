package com.silva.cleanarch.core.dataprovider;

import com.silva.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
