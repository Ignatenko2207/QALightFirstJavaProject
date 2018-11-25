package ua.com.qalight;

import ua.com.qalight.sedko.service.Randomizer;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class RandomizerRunner {

    private static Logger logger = Logger.getLogger(RandomizerRunner.class.getName());

    public static void main(String[] args) {

        Set<String> emails = new HashSet<>();

        for (int i = 0; i < 10; i++) {

            String email = Randomizer.getRandomString(Randomizer.getRandomInteger(8, 16));

            email += "@" + Randomizer.getRandomDomain(Randomizer.getRandomInteger(0, 5));

            emails.add(email);
        }

        for (String email : emails) {
            logger.info(email);
        }

    }

}
