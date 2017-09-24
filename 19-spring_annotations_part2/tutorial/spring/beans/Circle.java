package tutorial.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle {
	Point center;

	public Point getCenter() {
		return center;
	}

	
	@Resource(name="pointA")
	public void setCenter(Point center) {
		this.center = center;
	}
	@PostConstruct
	public void initializeCircle(){
		System.out.println("circle initialization");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("circle destroyed");
	}

	public void draw() {
		System.out.println("point A cordinates " + center.getX() + " : " + center.getY());

		
	}

	
}
