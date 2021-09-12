package com.example.udemybeermain.servicesImpl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.udemybeermain.services.CustomerService;
import com.example.udemybeermain.web.model.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID beerId) {
		return CustomerDto.builder()
				.id(UUID.randomUUID())
				.custName("name")
				.build();
	}

	@Override
	public CustomerDto saveNewCustomer(CustomerDto customerDto) {
		return CustomerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateCustomer(UUID beerId, CustomerDto customerDto) {
		
	}

	@Override
	public void deleteById(UUID beerId) {	
		log.debug("Deleting a beer ...");
	}

}
