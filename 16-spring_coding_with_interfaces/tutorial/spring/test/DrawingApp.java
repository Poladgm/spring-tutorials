package tutorial.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tutorial.spring.beans.Triangle;
import tutorial.spring.interfaces.Shape;

public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	//	Triangle triangle=(Triangle)context.getBean("triangle");
	//	triangle.draw();
		Shape  shape=(Shape) context.getBean("circle");
		shape.draw();
		shape=(Shape) context.getBean("triangle");
		shape.draw();
	}

}
