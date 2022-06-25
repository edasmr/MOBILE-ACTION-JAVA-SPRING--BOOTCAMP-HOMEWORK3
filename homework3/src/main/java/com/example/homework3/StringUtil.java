package com.example.homework3;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.util.StringUtils;

public class StringUtil {

    public static Long getRandomNumber(int charCount){

        String randomNumeric;
        do {
            randomNumeric = getRandomNumberAsString(charCount);
        } while (randomNumeric.startsWith("0"));

        Long randomLong = null;
        if (StringUtils.hasText(randomNumeric)){
            randomLong = Long.parseLong(randomNumeric);
        }

        return randomLong;
    }

    public static String getRandomNumberAsString(int charCount){

        String randomNumeric = RandomStringUtils.randomNumeric(charCount);

        return randomNumeric;
    }
}
