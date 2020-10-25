package com.foodAssistant.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {

    //装载配置文件的Properties对象
    private static Properties props;

    //IoC容器，存放bean对象
    private static Map<String,Object> beans;

    //给props赋值，将bean对象装载到IoC容器中
    static {
        try {
            props = new Properties();
            InputStream inputStream = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(inputStream);
            beans = new HashMap<String, Object>();
            Enumeration keys = props.keys();
            while(keys.hasMoreElements())
            {
                String key = keys.nextElement().toString();
                String beanPath = props.getProperty(key);
                Object value = Class.forName(beanPath).newInstance();
                beans.put(key,value);
            }
        }
        catch (Exception e)
        {
            throw new ExceptionInInitializerError("wrong with init properties");
        }
    }

    //获取bean对象的方法
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }

}