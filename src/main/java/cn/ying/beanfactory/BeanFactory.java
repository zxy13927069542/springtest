package cn.ying.beanfactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * ��������Bean����
 */
public class BeanFactory {
    private  static Properties properties;
    private static Map<String,Object> map;
    static{
        InputStream input = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        properties = new Properties();
        try {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Enumeration enumeration = properties.keys();
        map = new HashMap<String, Object>();

        while (enumeration.hasMoreElements()){
            String key = enumeration.nextElement().toString();
            String beanPath = properties.getProperty(key);
            System.out.println(beanPath);
            try {
                Object object = Class.forName(beanPath).newInstance();
                map.put(key, object);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * ����key��ȡBean����
     * @param key
     * @return
     */
    public static Object getBean(String key){
        return map.get(key);
    }
}
