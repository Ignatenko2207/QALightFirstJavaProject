package ua.com.qalight;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

//import ua.com.qalight.iserebryakov.User;

public class AppRunner {
	
	static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		
		Set <Integer> rooms = new HashSet<>();
		
		rooms.add(1);
		rooms.add(2);
		rooms.add(3);
		rooms.add(4);
		rooms.add(5);
		rooms.add(6);
		
	for(int i = 0; i < 38; i=i+1) {
		rooms.add(i);
	}
	logger.info(String.valueOf(rooms.size()));
}
		
	
	
	
	
	
	
	
	
//	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
//
//	public static void main(String[] args) {
//		
//		int[] rooms = new int[38];
//		
//		rooms[38] = 38;
//		
//		rooms[0] = 1;
//		
//		String str = "64";
//		
//		char[] symbols = str.toCharArray();
//		
//		Logger.info(String.valueOf(rooms[rooms.length-1]));
//		Logger.info(String.valueOf(rooms[36]));
		
//		User userPrime = new User();	
//		userPrime.setUserId(12345);
//		userPrime.setUserName("Ilya");
//		userPrime.setUserSurname("Serebryakov");
//		userPrime.setAge(20);
//		
//		Logger.info("User" + userPrime.getUserName() + "has id" + userPrime.getUserId());
}