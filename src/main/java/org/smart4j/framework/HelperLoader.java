package org.smart4j.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.framework.helper.BeanHelper;
import org.smart4j.framework.helper.ClassHelper;
import org.smart4j.framework.helper.ControllerHelper;
import org.smart4j.framework.helper.IoCHelper;
import org.smart4j.framework.util.ClassUtil;

/**
 * 加载相应的Helper类
 */
public class HelperLoader {

    public static final Logger LOGGER = LoggerFactory.getLogger(HelperLoader.class);

    public static void init() {

        Class<?>[] classes = {ClassHelper.class, BeanHelper.class, IoCHelper.class, ControllerHelper.class};

        for (Class<?> cls : classes) {
            LOGGER.debug("load class [{}]", cls.getName());
            ClassUtil.loadClass(cls.getName(), true);
        }
    }

}
