package tutorial.spring.beans;

import java.util.List;

public class Triangle {
	Point pointA;
	Point pointB;
	Point pointC;
	
	
	public void draw(){
		System.out.println("pointA "+pointA);
		System.out.println("pointB "+pointB);
		System.out.println("pointC "+pointC);
		
	};
	
	


	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
}
