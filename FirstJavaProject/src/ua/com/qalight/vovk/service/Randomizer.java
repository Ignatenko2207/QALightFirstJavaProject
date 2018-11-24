package ua.com.qalight.vovk.service;

import java.util.Arrays;
import java.util.List;

public class Randomizer {

	private static final String LETTERS_LOW_CASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String LETTERS_UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String NUMBERS = "1234567890";
	
	private static final List<String> DOMAINS = Arrays.asList("gmail.com", "hotmail.com", "mail.com", "i.ua", "bigmir.net");

	
/**
 * @author vovkolga
 * 
 * @param min - starts from variable
 * @param max - ends with (max-1)
 * @return
 */
	public static Integer getRandomInteger(int min, int max) {
		Integer maxValue =(int)((max-min)*Math.random());
		
		return min + maxValue;
		
	}
	
	public static String getRandomDomain(int index) {
		
		switch (index) {
		case 0:
			return DOMAINS.get(index);
		
		case 1:
			return DOMAINS.get(index);	
		case 2:
			return DOMAINS.get(index);
		case 3:
			return DOMAINS.get(index);
		case 4:
			return DOMAINS.get(index);
		
			default:
				return DOMAINS.get(0);
			
		
		}
	}
	
	public static String getRandomString(int stringLenght) {
		String out = "";
		
		
		for (int i = 0;i<stringLenght; i++) {
			out +=  getRandomLetter();
			
		}
		
		return out;
		
	}
	
	private static String getRandomLetter() {
		String sourceString = LETTERS_LOW_CASE + LETTERS_UPPER_CASE + NUMBERS;

		int srcLenght = sourceString.length();
		
		return String.valueOf(sourceString.charAt(getRandomInteger(0,srcLenght-1)));
		
	}
	
}

