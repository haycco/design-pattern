/**
 * CopyRright (c) 2000-2011:   hay                          
 * Project:                    pattern-demo
 * FileName:                   URLUtil.java 
 * Comments:                   URL������                                  
 * JDK version used:           JDK1.5.0                             
 * Author��                    haycco                 
 * Create Date��               2011-8-24 ����8:33:02   
 * Version:                    1.0
 *
 */
package org.haycco.util;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;

/**
 * Description: ��ȫ�Ļ�ȡ��ǰ���·����URL������
 * 
 * @author haycco
 */
@SuppressWarnings("rawtypes")
public class URLUtil {

    /**
     * Description: ȡ�õ�ǰ�����ڵ��ļ�
     * 
     * @param clazz
     * @return
     */
    public static File getClassFile(Class clazz) {
        URL path = clazz.getResource(clazz.getName().substring(clazz.getName().lastIndexOf(".") + 1) + ".class");
        if (path == null) {
            String name = clazz.getName().replaceAll("[.]", "/");
            path = clazz.getResource("/" + name + ".class");
        }
        return new File(path.getFile());
    }

    /**
     * Description: ͬgetClassFile ������ı�������
     * 
     * @param clazz
     * @return
     */
    public static String getClassFilePath(Class clazz) {
        try {
            return URLDecoder.decode(getClassFile(clazz).getAbsolutePath(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Description: ȡ�õ�ǰ�����ڵ�ClassPathĿ¼
     * 
     * @param clazz
     * @return
     */
    public static File getClassPathFile(Class clazz) {
        File file = getClassFile(clazz);
        for (int i = 0, count = clazz.getName().split("[.]").length; i < count; i++)
            file = file.getParentFile();
        if (file.getName().toUpperCase().endsWith(".JAR!")) {
            file = file.getParentFile();
        }
        return file;
    }

    /**
     * Description: ͬgetClassPathFile ������ı�������
     * 
     * @param clazz
     * @return
     */
    public static String getClassPath(Class clazz) {
        try {
            return URLDecoder.decode(getClassPathFile(clazz).getAbsolutePath(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(getClassFilePath(URLUtil.class));
        System.out.println(getClassPath(URLUtil.class));
    }

}
