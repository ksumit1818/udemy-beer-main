package com.example.udemybeermain.servicesImpl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.udemybeermain.services.BeerService;
import com.example.udemybeermain.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder()
				.id(UUID.randomUUID())
				.beerName("name")
				.version(100)
				.build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		return BeerDto.builder()
				.id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		
	}

	@Override
	public void deleteById(UUID beerId) {	
		log.debug("Deleting a beer ...");
	}
	
	

}
