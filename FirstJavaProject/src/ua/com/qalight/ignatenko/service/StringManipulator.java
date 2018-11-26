package ua.com.qalight.ignatenko.service;

import java.math.BigDecimal;
import java.text.Format;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

import ua.com.qalight.ignatenko.User;

public class StringManipulator {

	static Logger logger = Logger.getLogger(StringManipulator.class.getName());

	public static void main(String[] args) {
		String str = "some string ";
		
//		logger.info(str);

		User user = new User();
		
		user.setUserName("Alex");
		user.setUserSurname("Ignatenko");
		
		str = str + user;
		str = str + " 12.3456 ";
		str = str + user;
		str = str + " " + "%s";
		str = str + " " + "%s";
		str = str + " " + "%d";
					
		// текст кириллицей недопустим
		str = String.format(str, "formated string", "formated stringVol2", 123);
		
		logger.info(str);
	}
	
}
