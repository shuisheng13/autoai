package com.navinfo.autoai.autoaidemol.config;

import java.util.Properties;

public class PropertiesUtils {
    public static final String COMMON = "apollo-common";
    public static final Properties properties = new Properties();

    public PropertiesUtils() {
    }

    public String getString(String key) {
        return properties.getProperty(key);
    }

    public Integer getInteger(String key) {
        try {
            return Integer.parseInt(properties.getProperty(key));
        } catch (Exception var3) {
            return null;
        }
    }

    public Long getLong(String key) {
        try {
            return Long.parseLong(properties.getProperty(key));
        } catch (Exception var3) {
            return null;
        }
    }

    public Boolean getBoolean(String key) {
        try {
            return Boolean.parseBoolean(properties.getProperty(key));
        } catch (Exception var3) {
            return null;
        }
    }
}
