package com.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderBase {
    public static void main(String[] args) throws IOException {

        // to utilize config.property we have to use following way, config.prop is a file where all user data stored so every tile we dont have to search where is our data
// this concept is used here only for our understanding, in real life we dont create property base reader class
        Properties property = new Properties(); // here we are initializing property
        property.load(new FileInputStream("src/test/resources/config/config.properties"));

        // following are way of property reader
        System.out.println(property.getProperty("url"));
        System.out.println(property.getProperty("userName"));
    }
}
