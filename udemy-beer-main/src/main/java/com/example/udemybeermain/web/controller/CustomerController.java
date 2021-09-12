package com.example.udemybeermain.web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.udemybeermain.services.CustomerService;
import com.example.udemybeermain.web.model.CustomerDto;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId){
		return new ResponseEntity<>(CustomerDto.builder().build(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<CustomerDto> savedNewCustomer(@RequestBody CustomerDto customerDto) {
		CustomerDto savedDto= customerService.saveNewCustomer(customerDto);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", "/api/v1/customer" + savedDto.getId().toString());
		return new ResponseEntity<>(headers,HttpStatus.CREATED);
	}
	
	@PutMapping("/{customerId}")
	public ResponseEntity<CustomerDto> updateCustomerById(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/{customerId}")
	public ResponseEntity<CustomerDto> deleteCustomerById(@PathVariable("customerId") UUID customerId) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
