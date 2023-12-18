package com.ty;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBean {
	public static void main(String[] args) {
	   Resource resource = new ClassPathResource("my_conf.xml");
       BeanFactory beanFactory =new XmlBeanFactory(resource);
       Person person = (Person) beanFactory.getBean("myPerson");
       person.message();
	}
}
