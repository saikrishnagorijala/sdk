package org.saikrishna.test;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		//Triangle tri =new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); 
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		shape Shape = (shape) context.getBean("triangle");
		Shape.draw();
		} 
}