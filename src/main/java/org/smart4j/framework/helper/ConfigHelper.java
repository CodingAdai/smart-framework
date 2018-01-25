package org.smart4j.framework.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.framework.ConfigConstant;
import org.smart4j.framework.util.PropsUtil;

import java.util.Map;
import java.util.Properties;

public class ConfigHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigHelper.class);

    private static final Properties CONFIG_PROPS;

    static {

        CONFIG_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);
        for (Map.Entry<Object, Object> entry : CONFIG_PROPS.entrySet()) {
            LOGGER.debug("{}:{}", entry.getKey(), entry.getValue());
        }
    }


    /**
     * 获取JDBC驱动
     */
    public static String getJDBCDriver() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_DRIVER);
    }


    /**
     * 获取JDBC URL
     */
    public static String getJDBCUrl() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_URL);
    }


    /**
     * 获取数据库用户名
     */
    public static String getJDBCUsername() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_USERNAME);
    }


    /**
     * 获取数据库密码
     */
    public static String getJDBCPassword() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.JDBC_PASSWORD);
    }


    /**
     * 获取应用基础包名
     */
    public static String getAppBasePackage() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_BASE_PACKAGE);
    }


    /**
     * 获取应用JSP 路径
     */
    public static String getAppJSPPath() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_JSP_PATH, "/WEB-INF/view/");
    }


    /**
     * 获取应用静态资源路径
     */
    public static String getAppAssetPath() {
        return PropsUtil.getString(CONFIG_PROPS, ConfigConstant.APP_ASSET_PATH, "/asset");
    }


}
