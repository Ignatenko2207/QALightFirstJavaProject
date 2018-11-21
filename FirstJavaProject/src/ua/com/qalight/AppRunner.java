package ua.com.qalight;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Logger;

import ua.com.qalight.ignatenko.User;

public class AppRunner {

	static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		
		List<Integer> rooms = new ArrayList<>();

		int i = 0;
//		i=15;
//		logger.info(String.valueOf(i));
//
//		i=25;
//		logger.info(String.valueOf(i));
//
//		i=258;
//		logger.info(String.valueOf(i));

		for(i = 0; i < 10; i++) {
			rooms.add(i);
		}
		
		for (int j = 0; j < rooms.size(); j++) {
			logger.info("room " + String.valueOf(rooms.get(j)));
		}
		logger.info(String.valueOf(rooms.size()));
		
 	}

	
}
