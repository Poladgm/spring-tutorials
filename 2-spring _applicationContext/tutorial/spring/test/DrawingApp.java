package tutorial.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import tutorial.spring.beans.Triangle;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");				
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
