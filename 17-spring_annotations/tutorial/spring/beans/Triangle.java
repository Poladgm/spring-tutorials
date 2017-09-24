package tutorial.spring.beans;

import org.springframework.beans.factory.annotation.Required;

public class Triangle {

	Point a;
    Point b;
    Point c;
	public Point getA() {
		return a;
	}
	@Required
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public Point getC() {
		return c;
	}
	public void setC(Point c) {
		this.c = c;
	}
    
    public void draw(){
    	System.out.println("point A cordinates "+a.getX()+" : "+a.getY());

    	System.out.println("point B cordinates "+b.getX()+" : "+b.getY());

    	System.out.println("point C cordinates "+c.getX()+" : "+c.getY());
    }
	
}
