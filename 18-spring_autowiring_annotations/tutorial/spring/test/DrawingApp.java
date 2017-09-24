package tutorial.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tutorial.spring.beans.Circle;
import tutorial.spring.beans.Triangle;

public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Circle circle=(Circle) context.getBean("circle");
		circle.draw();
	}

}
