package com.fujias.itesting.base.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

/**
 * 属性文件工具类
 * 
 * @author FBSE
 * 
 */
public class PropertiesUtil {

    // 属性文件名
    private static final String FILE = "common.properties";
    // 属性文件
    private static Properties property = new Properties();

    private PropertiesUtil() {
        return;
    }

    /**
     * 取得内容
     * 
     * @param fileName
     */
    private static void setProperty(String fileName) {
        try {
            InputStream is = null;
            try {
                ClassLoader loader = PropertiesUtil.class.getClassLoader();

                if (fileName != null) {
                    is = loader.getResourceAsStream(fileName);
                } else {
                    is = loader.getResourceAsStream(FILE);
                }
                property.load(is);
            } finally {
                if (is != null) {
                    is.close();
                    is = null;
                }
            }

        } catch (IOException ex) {

        }
    }

    /**
     * 根据键值取得内容
     * 
     * @param key
     * @return
     */
    public static String getPropertyValue(String key) {
    	if("server.domain".equals(key)){
    		String ip = null;
			try {
				ip = InetAddress.getLocalHost().getHostAddress();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		return "http://"+ip+":8080";
    	}
        setProperty(null);
        return property.getProperty(key);
    }

    /**
     * 根据键值取得内容
     * 
     * @param key
     * @param value
     *            没有键时，返回该值
     * @return
     */
    public static String getPropertyValue(String key, String value) {
        setProperty(null);
        return property.getProperty(key, value);
    }

    /**
     * 获取属性文件
     * 
     * @param fileName
     * @return
     */
    public static Properties getProperty(String fileName) {
        setProperty(fileName);
        return property;
    }

    /**
     * 获取图片的访问路径
     * 
     * @param fileName
     * @return
     */
    public static String getImageReadUrl(String fileName) {
        setProperty(null);
        return property.getProperty("server.domain")
                + property.getProperty("server.domain.image") 
                + fileName;
    }
}