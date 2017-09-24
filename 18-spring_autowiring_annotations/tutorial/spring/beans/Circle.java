package tutorial.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle {
	Point center;

	public Point getCenter() {
		return center;
	}

	
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}
	

	public void draw() {
		System.out.println("point A cordinates " + center.getX() + " : " + center.getY());

		
	}

	
}
