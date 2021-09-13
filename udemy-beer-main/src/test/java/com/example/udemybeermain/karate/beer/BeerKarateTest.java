package com.example.udemybeermain.karate.beer;

import com.intuit.karate.junit5.Karate;

public class BeerKarateTest {
	
	@Karate.Test
	Karate runAll() {
		return Karate.run().relativeTo(getClass());
	}

}
