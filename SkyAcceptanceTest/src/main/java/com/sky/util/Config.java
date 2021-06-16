package com.sky.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private static String filePath;

    public static String getTestData(String keyName) {
        filePath = System.getProperty("user.dir") + "/src/main/resources/config.properties";
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();
        try {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(keyName);
    }
}
