package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean2 {
	public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("my_conf.xml");
        Person person = (Person) applicationContext.getBean("myPerson");
        person.message();
	}
}
