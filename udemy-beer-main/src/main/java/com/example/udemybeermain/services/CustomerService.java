package com.example.udemybeermain.services;

import java.util.UUID;

import com.example.udemybeermain.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID beerId);

	CustomerDto saveNewCustomer(CustomerDto customerDto);

	void updateCustomer(UUID beerId, CustomerDto customerDto);

	void deleteById(UUID beerId);


}
