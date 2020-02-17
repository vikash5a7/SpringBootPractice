package com.bidgelabz.fundoo.service;

import java.util.List;

import com.bidgelabz.fundoo.shared.dto.AddressDTO;

public interface AddressService {
	List<AddressDTO> getAddresses(String userId);
    AddressDTO getAddress(String addressId);
}
