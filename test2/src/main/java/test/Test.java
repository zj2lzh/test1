package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

/**
 * Created by grid on 2016/7/18.
 */
public class Test {
    public static void main(String[] args){
        Date dd;
        Properties prop = new Properties();
        InputStream in = Object.class.getResourceAsStream("/test/db.properties");
        try {
            prop.load(in);
            String param1 = prop.getProperty("test").trim();
            System.out.println("-----------"+param1);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
