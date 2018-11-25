package ua.com.qalight;

import java.util.logging.Logger;

import static java.lang.String.valueOf;

public class SumNumberRunner {

    private static Logger logger = Logger.getLogger(SumNumberRunner.class.getName());

    public static void main(String[] args) {

        int number = 987654;

        logger.info(valueOf(getSumByDivision(number)));
        logger.info(valueOf(getSumBySplit(number)));
    }

    private static Integer getSumBySplit(int number) {
        Integer result = 0;
        String intAsText = valueOf(number);
        char[] symbols = intAsText.toCharArray();
        for (char symbol : symbols) {
            result += Character.getNumericValue(symbol);

        }

        return result;
    }

    private static Integer getSumByDivision(int number) {
        Integer result = 0;

        while (number != 0) {
            result += number % 10;
            number = number / 10;
        }

        return result;
    }
}
