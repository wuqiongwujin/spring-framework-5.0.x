package org.springframework.wuqiongtest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @author Cain
 * @Description
 * @date 2019/6/16
 */
public class BeanFactoryTest {

	@Test
	public void xmlBeanFactoryBeanFactory() {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(""));
		factory.getBean(Class.class);
	}

	@Test
	public void classPathContextTest() {
		BeanFactory context = new ClassPathXmlApplicationContext(".xml");
		context.getBean(Class.class);
	}

	@Test
	public void annotationConfigApplicationContextTest() {
		BeanFactory context = new AnnotationConfigApplicationContext(Class.class);
		context.getBean(Class.class);
	}

	@Test
	public void annotationConfigWebApplicationContextTest() {
		//spring-web应用上下文
		BeanFactory context = new AnnotationConfigWebApplicationContext();
		context.getBean(Class.class);
	}

	@Test
	public void fileSystemXmlApplicationContextTest() {
		BeanFactory context = new FileSystemXmlApplicationContext(".xml");
	}

	@Test
	public void xmlWebApplicationContextTest() {
		BeanFactory context = new XmlWebApplicationContext();
		context.getBean(Class.class);
	}
}
