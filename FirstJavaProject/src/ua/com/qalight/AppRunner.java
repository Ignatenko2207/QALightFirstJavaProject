package ua.com.qalight;

import java.util.logging.Logger;

import ua.com.qalight.ignatenko.User;

public class AppRunner {

	static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		
		User userAlex = new User();
		userAlex.setUserId(12345);
		userAlex.setUserName("Alex");
		userAlex.setUserSurname("Ignatenko");
		userAlex.setAge(35);
		
		logger.info("User " + userAlex.getUserName() + " has id " + userAlex.getUserId());
		
		User userPupkin = new User();
		userPupkin.setUserId(12346);
		userPupkin.setUserName("Vasil");
		userPupkin.setUserSurname("Pupkin");
		userPupkin.setAge(33);
		
		logger.info("User " + userPupkin.getUserName() + " has id " + userPupkin.getUserId());

 	}
	
	private void printSomething(String text)
	{
		System.out.println(text);
	}
	
	private void printSomething(String text, Integer iterator)
	{
		for (int i = 0; i < iterator; i++) {
			System.out.println(text);
		}
	}
}
