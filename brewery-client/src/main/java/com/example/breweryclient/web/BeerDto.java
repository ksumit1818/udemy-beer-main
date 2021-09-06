package com.example.breweryclient.web;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BeerDto {

	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;

}
