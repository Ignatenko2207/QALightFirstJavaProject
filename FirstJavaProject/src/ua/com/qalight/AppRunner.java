package ua.com.qalight;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import ua.com.qalight.vovk.service.Randomizer;

public class AppRunner {

	static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {

		Set<String> emails = new HashSet<>();

		for (int i = 0; i < 10; i++) {

			String login = Randomizer.getRandomString(Randomizer.getRandomInteger(8, 16));

			String email = login + "@" + Randomizer.getRandomDomain(Randomizer.getRandomInteger(1, 5));

			emails.add(email);

		}
		for (String email : emails) {
			logger.info(email);
		}
	}

}
