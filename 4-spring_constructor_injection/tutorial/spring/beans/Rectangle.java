package tutorial.spring.beans;

public class Rectangle {
	private String type;
	private int height;

	public Rectangle(String type){
	this.type=type;	
	}
	
	public Rectangle(int height){
		this.height=height;
	}
	
	public Rectangle(String type,int height){
		this.type=type;
		this.height=height;
	}
	
	public void draw(){
		System.out.println(type+" Rectangle drawing's height is : " + height);
	}

	
	
}
