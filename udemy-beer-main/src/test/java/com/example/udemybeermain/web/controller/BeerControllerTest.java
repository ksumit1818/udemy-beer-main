package com.example.udemybeermain.web.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.udemybeermain.web.model.BeerDto;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(BeerController.class)
class BeerControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Autowired
	ObjectMapper objectMapper;

	@Test
	void testGetBeerById() throws Exception {
		try {
			mockMvc.perform(get("/api/v1/beer/" + UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
					.andExpect(status().isOk());
			fail("Not yet implemented");
		} catch (Exception ex) {
			return;
		}
	}

	@Test
	void testSavedNewBeer() {

		try {
			BeerDto beerDto = BeerDto.builder().build();
			String beerDtoJson = objectMapper.writeValueAsString(beerDto);

			mockMvc.perform(post("/api/v1/beer/").contentType(MediaType.APPLICATION_JSON).content(beerDtoJson))
					.andExpect(status().isCreated());
		} catch (Exception ex) {
			return;
		}
	}

	@Test
	void testUpdateBeerById() {
		try {
			BeerDto beerDto = BeerDto.builder().build();
			String beerDtoJson = objectMapper.writeValueAsString(beerDto);

			mockMvc.perform(post("/api/v1/beer/" + UUID.randomUUID().toString()).contentType(MediaType.APPLICATION_JSON)
					.content(beerDtoJson)).andExpect(status().isNoContent());
		} catch (Exception ex) {
			return;
		}
	}

}
