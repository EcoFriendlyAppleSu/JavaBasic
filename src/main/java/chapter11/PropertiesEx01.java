package chapter11;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx01 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("lee", "100");
        properties.setProperty("kim", "200");
        properties.setProperty("choi", "300");
        properties.setProperty("park", "400");

        Enumeration<?> enumeration = properties.propertyNames();

        properties.list(System.out);
    }
}
