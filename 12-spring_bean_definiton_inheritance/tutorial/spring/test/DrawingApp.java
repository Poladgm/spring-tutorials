package tutorial.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tutorial.spring.beans.Rectangle;
import tutorial.spring.beans.Triangle;

public class DrawingApp {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		Rectangle triangle = (Rectangle) context.getBean("rectangle1");
		triangle.draw();
	}
}
