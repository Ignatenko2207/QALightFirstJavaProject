package ua.com.qalight;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Logger;

public class AppRunner {

    static Logger logger = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {

//        User userAnastasiia = new User();
//
//        userAnastasiia.setUserId(44444);
//        userAnastasiia.setUserName("Anastasiia");
//        userAnastasiia.setUserSurname("Sedko");
//        userAnastasiia.setAge(18);
//
//        logger.info("User " + userAnastasiia.getUserName() + " has id " + userAnastasiia.getUserId());

//        int[] rooms = new int[38];
//
//        rooms[37] = 38;
//
//        rooms[0] = 1;
//
//        String str = "64";
//        char[] symbols = str.toCharArray();
//
//
//        logger.info(String.valueOf(rooms[rooms.length - 1]));
//        logger.info(String.valueOf(symbols));
//
//        Set<Integer> rooms = new HashSet<>();
//
//        rooms.add(1);
//        rooms.add(2);
//        rooms.add(3);
//        rooms.add(4);
//        rooms.add(5);
//
//        logger.info(String.valueOf(rooms.size()));


//        for (int i = 1; i < 38; i++) {
//            if (i < 3) {
//                continue;
//            }
//
//            rooms.add(i);
//            if (i > 7) {
//                break;
//            }
//        }
//
//        logger.info(String.valueOf(rooms.size()));

        List<Integer> rooms = new ArrayList<>();

        for (int i = 1; i < 38; i++) {
            if (i < 3) {
                continue;
            }

            rooms.add(i);
            if (i < 35 && i > 5) {
                logger.info("Last added is " + String.valueOf(rooms.get(rooms.size() - 1)));
                break;
            }
        }

//        Queue<Integer> roomsQ = new PriorityQueue<>();
//
//        for (int i = 1; i < 38; i++) {
//            if (i < 3) {
//                continue;
//            }
//
//            roomsQ.add(i);
//            if (i < 35 && i > 5) {
//                logger.info("Last added is " + String.valueOf(roomsQ.poll()));
//                break;
//            }
//        }

        for (int j = 0; j < rooms.size(); j++){

            logger.info((String.valueOf("room " + rooms.get(j))));
        }
        logger.info(String.valueOf(rooms.size()));
    }
}
