package org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 属性文件工具类
 */
public class PropsUtil {

    public static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);


    /**
     * 加载属性文件
     */
    public static Properties loadProps(String fileName) {
        Properties properties = null;
        InputStream is = null;

        is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);

        try {
            if (is == null) {
                throw new FileNotFoundException("file " + fileName + " not found!");
            }
            properties = new Properties();
            properties.load(is);

        } catch (Exception e) {
            LOGGER.error("load properties failure", e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    LOGGER.error("close stream failure", e);
                }
            }
        }

        return properties;
    }


    /**
     * 获取字符串属性（默认值为空字符串）
     *
     * @param properties
     * @param key
     * @return
     */
    public static String getString(Properties properties, String key) {
        return getString(properties, key, "");
    }


    /**
     * 获取字符串属性（可指定默认值）
     *
     * @param properties
     * @param key
     * @param defaultValue
     * @return
     */
    public static String getString(Properties properties, String key, String defaultValue) {

        return properties.getProperty(key, defaultValue);
    }


}
