package ua.com.qalight.vovk.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestRandomizer {

	@Test
	public void testGetRandomInteger() {
		 Integer result = Randomizer.getRandomInteger(0, 10);
		 assertTrue(result < 10 && result >= 0);
	}

	@Test
	public void testGetRandomDomain() {
		
		String result = Randomizer.getRandomDomain(0);
		
		assertEquals("gmail.com", result);
		
		result = Randomizer.getRandomDomain(4);
		assertEquals("bigmir.net", result);
		
	}

	

	@Test
	public void testGetRandomString() {

		String result = Randomizer.getRandomString(15);
		assertEquals(15, result.length());
				
	}

}
