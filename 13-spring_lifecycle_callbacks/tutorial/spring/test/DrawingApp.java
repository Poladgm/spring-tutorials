package tutorial.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tutorial.spring.beans.Triangle;

public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle=(Triangle)context.getBean("triangle");
		triangle.draw();
	}

}
