package ua.com.qalight;

import java.util.logging.Logger;

import ua.com.qalight.iserebryakov.User;

public class AppRunner {
	
	static Logger Logger = logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {
		
		User userPrime = new User();	
		userPrime.setUserId(12345);
		userPrime.setUserName("Ilya");
		userPrime.setUserSurname("Serebryakov");
		userPrime.setAge(20);
		
		Logger.info("User" + userPrime.getUserName() + "has id" + userPrime.getUserId());
	}
}