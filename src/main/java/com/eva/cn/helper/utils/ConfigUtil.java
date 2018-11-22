package com.eva.cn.helper.utils;

/**
 * Create By ZhangSenWei on 2018/11/22
 **/
public class ConfigUtil {

    public ConfigUtil() {
    }


    private static FileProperties SystemAttributes = new FileProperties("/conf.properties");

    public static String getAttribute(String key) {
        if (SystemAttributes != null) {
            return SystemAttributes.getProperty(key);
        } else {
            return null;
        }
    }

    public static String getAttribute(String key, String defaultValue) {
        if (SystemAttributes != null) {
            return SystemAttributes.getProperty(key, defaultValue);
        } else {
            return null;
        }
    }
}
