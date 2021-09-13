package com.example.udemybeermain.karate.customer;

import com.intuit.karate.junit5.Karate;

public class CustomerKarateTest {
	
	@Karate.Test
	Karate runAll() {
		return Karate.run().relativeTo(getClass());
	}

}
