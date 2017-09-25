package tutorial.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

// @Service
//@Controller

@Component
public class Circle {
	Point center;

	MessageSource messageSource;

	public Point getCenter() {
		return center;
	}

	@Resource(name = "pointA")
	public void setCenter(Point center) {
		this.center = center;
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("circle initialization");
	}

	@PreDestroy
	public void destroyCircle() {
		System.out.println("circle destroyed");
	}

	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle",null,"not found",null));
System.out.println(this.messageSource.getMessage("drawing.point", new Object[]{center.getX(),center.getY()},"Not --found",null));
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

}
