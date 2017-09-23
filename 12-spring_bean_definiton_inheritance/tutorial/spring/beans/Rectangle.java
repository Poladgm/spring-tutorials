package tutorial.spring.beans;

import java.util.List;

public class Rectangle {
	List<Point> points;

	public void draw() {
		for (Point p : points) {
			System.out.println("list: " + p);
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	
	
}
