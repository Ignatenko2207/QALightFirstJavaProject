package ua.com.qalight.sedko.service;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomizerTest {

    private static Logger logger = Logger.getLogger(RandomizerTest.class.getName());

    @Test
    void testGetRandomInteger() {

        Integer result = Randomizer.getRandomInteger(1, 10);

        logger.info("Random Integer is " + result);

        assertTrue(result >= 1 && result <= 10, "The result does not match the range");

        assertFalse(result < 1 || result > 10, "The result matches the value");
    }

    @Test
    void testGetRandomIntegerNegative() {

        Integer result = Randomizer.getRandomInteger(-15, -2);

        logger.info("Random Integer is " + result);

        assertTrue(result >= -15 && result <= -2, "The result does not match the range");

        assertFalse(result < -15 || result > -2, "The result matches the value");
    }

    @Test
    void testGetRandomDomainHotmail() {

        String result = Randomizer.getRandomDomain(2);

        logger.info("Random Domain is " + result);

       assertTrue(result.equals("hotmail.com"), "The result does not match the value");
    }

    @Test
    void testGetRandomDomainBigmir() {

        String result = Randomizer.getRandomDomain(5);

        logger.info("Random Domain is " + result);

       assertTrue(result.equals("bigmir.net"), "The result does not match the value");
    }

    @Test
    void testGetRandomDomainDefaultValue() {

        String result = Randomizer.getRandomDomain(28);

        logger.info("Random Domain is " + result);

       assertTrue(result.equals("gmail.com"), "The result does not match the value");
    }

    @Test
    void testGetRandomString() {

        String result = Randomizer.getRandomString(10);

        logger.info("Random String is " + result);

       assertTrue(result.length() == 10, "The result does not match the value");
    }

    @Test
    void testGetRandomStringWithRandomLength() {

        String result = Randomizer.getRandomString(Randomizer.getRandomInteger(5, 15));

        logger.info("Random String is " + result);

       assertTrue(result.length() >= 5 && result.length() <= 15, "The result does not match the value");
    }
}
