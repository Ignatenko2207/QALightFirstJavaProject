package ua.com.qalight;

import ua.com.qalight.sedko.User;

import java.util.logging.Logger;

public class AppRunner {

    static Logger logger = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {

        User userAnastasiia = new User();

        userAnastasiia.setUserId(44444);
        userAnastasiia.setUserName("Anastasiia");
        userAnastasiia.setUserSurname("Sedko");
        userAnastasiia.setAge(18);

        logger.info("User " + userAnastasiia.getUserName() + " has id " + userAnastasiia.getUserId());
    }
}
