package tutorial.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.ast.AstUtils;

import tutorial.spring.beans.Circle;
import tutorial.spring.beans.Triangle;

public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		context.registerShutdownHook();
		Circle circle = (Circle) context.getBean("circle");
		circle.draw();
		System.out.println(context.getMessage("greeting", null,"cant find",null));
	}

}
