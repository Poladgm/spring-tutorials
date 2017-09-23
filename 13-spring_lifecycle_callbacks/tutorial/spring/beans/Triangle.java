package tutorial.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean {


	Point a;
	Point b;
	Point c;

	public Point getA() {
		return a;
	}

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

	public void draw() {
		System.out.println("point A cordinates " + a.getX() + " : " + a.getY());

		System.out.println("point B cordinates " + b.getX() + " : " + b.getY());

		System.out.println("point C cordinates " + c.getX() + " : " + c.getY());
	}
	
	
	  public void destroy() throws Exception {
	 System.out.println("desposablebean destroy method called for triangle");
	  }
	  public void afterPropertiesSet() throws Exception { System.out.println(
	  "InitializingBean afterPropertiesSet method called for triangle");
	  
	  }
	 
	
	public void ownInit(){
		 System.out.println("ownInit called for triangle");
	}
	
	public void ownDestroy(){
		 System.out.println("ownDestroy called for triangle");
	}
	

}
