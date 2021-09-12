package com.example.breweryclient.web.client;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.breweryclient.web.BeerDto;
import com.example.breweryclient.web.CustomerDto;

@SpringBootTest
class BreweryClientTest {

	@Autowired
	BreweryClient client;
	
	@Test
	void testGetBeerById() {
		BeerDto dto = client.getBeerById(UUID.randomUUID());
		assertNotNull(dto);
	}

	@Test
	void testSaveNewBeer() {
		BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();
		URI uri = client.saveNewBeer(beerDto);
		assertNotNull(uri);
		System.out.println(uri.toString());
	}
	
	@Test
	void testUpdateBeer() {
		BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();
		client.updateBeer(UUID.randomUUID(), beerDto);
	}
	
	@Test
	void testDeleteBeer() {
		client.deleteBeer(UUID.randomUUID());
	}
	
	/////Customer
	
	@Test
	void testGetCustomerById() {
		CustomerDto dto = client.getCustomerById(UUID.randomUUID());
		assertNotNull(dto);
	}

	@Test
	void testSaveNewCustomer() {
		CustomerDto customerDto = CustomerDto.builder().custName("New Beer").build();
		URI uri = client.saveNewCustomer(customerDto);
		assertNotNull(uri);
		System.out.println(uri.toString());
	}
	
	@Test
	void testUpdateCustomer() {
		CustomerDto customerDto = CustomerDto.builder().custName("New Beer").build();
		client.updateCustomer(UUID.randomUUID(), customerDto);
	}
	
	@Test
	void testDeleteCustomer() {
		client.deleteCustomer(UUID.randomUUID());
	}
}
