package com.hans.helper;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;

public class Utility {

    public static File getJSONSchemaFile(String JSONFile){
        return new File("src/test/java/com/hans/helper/JSONSchemaData/" + JSONFile);
    }

    public static String generateRandomEmail() {
        String email = "";
        String temp = RandomStringUtils.randomAlphanumeric(10);
        email = temp + "@testdata.com";
        return email;
    }
}
