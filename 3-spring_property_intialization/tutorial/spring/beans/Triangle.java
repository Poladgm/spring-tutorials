package tutorial.spring.beans;

public class Triangle {
	String type;
	

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
