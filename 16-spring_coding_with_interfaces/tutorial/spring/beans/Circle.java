package tutorial.spring.beans;

import tutorial.spring.interfaces.Shape;

public class Circle implements Shape {
	Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {

		System.out.println("Circle cordinates");
		System.out.println("point A cordinates " + center.getX() + " : "
				+ center.getY());

	}

}
