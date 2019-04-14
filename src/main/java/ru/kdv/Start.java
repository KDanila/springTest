package ru.kdv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        t1000 t1 = (t1000)context.getBean("t1000Empty");
        t1.action();
    }
}
