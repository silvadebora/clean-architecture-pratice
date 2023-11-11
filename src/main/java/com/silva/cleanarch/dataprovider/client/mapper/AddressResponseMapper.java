package com.silva.cleanarch.dataprovider.client.mapper;

import com.silva.cleanarch.core.domain.Address;
import com.silva.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
