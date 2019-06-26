package cn.edu.bupt.bnrc.listener;

import cn.edu.bupt.bnrc.generatid.Snowflake;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import static java.lang.Thread.sleep;

public class MyServletContextListener implements ServletContextListener {
    public static Snowflake snowflake;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("1111111111111初始化");
        snowflake = new Snowflake(1, 1, 1);
        for (int i = 0; i < 30; i++) {
            System.out.println(snowflake.nextId());
        }
//        try {
//            sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i < 30; i++) {
//            System.out.println(snowflake.nextId());
//        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
