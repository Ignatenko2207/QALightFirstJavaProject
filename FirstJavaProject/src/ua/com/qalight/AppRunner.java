package ua.com.qalight;

import java.util.logging.Logger;

import ua.com.qalight.ignatenko.User;

public class AppRunner {

	static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		User.showClassName();
		
 	}
}
