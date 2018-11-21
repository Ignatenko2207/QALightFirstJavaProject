package ua.com.qalight;

//import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
//import java.util.Set;
import java.util.logging.Logger;
//import ua.com.qalight.pylypchuk.User;

public class AppRunner {

	static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		
//		Integer[] rooms = new Integer[38];
//		String str = "64";
//		char[] symbols = str.toCharArray();
//		rooms[37] = 38;
//		rooms[0] = 1;
//		logger.info(String.valueOf(rooms[rooms.length-1]));
//		logger.info(String.valueOf(rooms[36]));
//		   rooms.add(1);
//		   rooms.add(2);
//		   rooms.add(3);
//		   rooms.add(4);
//		   rooms.add(5);
		
//	   Set<Integer> rooms = new HashSet<>();
//	   
//	   for(int i = 0;i<38; i++) {
//		   rooms.add(i);
//	   }
//		List<Integer> rooms = new ArrayList<>();
//		   
//		   for(int i = 0;i<38; i++) {
//			   rooms.add(i);
//		   }
		Queue<Integer> rooms = new PriorityQueue<>();
		   
		   for(int i = 0;i<38; i++) {
			   rooms.add(i);
			   
		   }
	   
	   logger.info(String.valueOf(rooms.size()));
	}
}
