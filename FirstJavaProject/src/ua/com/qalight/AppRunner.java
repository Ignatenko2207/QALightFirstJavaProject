package ua.com.qalight;


import java.util.logging.Logger;

import ua.com.qalight.vovk.User;

public class AppRunner {
	
	static Logger logger = Logger.getLogger(AppRunner.class.getName());
	

	public static void main(String[] args) {
		System.out.println("out text");
		
		User userOlga = new User();
		userOlga.setUserId(1997);
		userOlga.setUreSurname("Vovk");
		userOlga.setAge(21);
		userOlga.setUserName("Olga");
		
		logger.info("User" + userOlga.getUserName() + "has Id" + userOlga.getUserId());
		
	}
}
