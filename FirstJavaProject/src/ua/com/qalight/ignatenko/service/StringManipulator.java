package ua.com.qalight.ignatenko.service;

import java.util.logging.Logger;

public class StringManipulator {

	static Logger logger = Logger.getLogger(StringManipulator.class.getName());

	public static void main(String[] args) {
		String str = "some string";
		
		logger.info(str);

		str = str + 1258;
		
		logger.info(str);
	}
	
}
