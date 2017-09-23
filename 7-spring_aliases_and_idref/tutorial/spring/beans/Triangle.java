package tutorial.spring.beans;

public class Triangle {
	String type;
	Point point;
	
	

	public Point getPoint() {
		return point;
	}


	public void setPoint(Point point) {
		this.point = point;
	}


	public void draw(){
		System.out.println("Triangle drawing type: "+type);
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
}
