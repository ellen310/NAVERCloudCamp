//package c.modeling.ex01;

public class Rectangle_ 
{

	///Field
	private int width;
	private int length;
	private String color;



	///Getter Method
	public int getWidth(){
		return this.width;
	}
	public int getLength(){
		return this.length;
	}
	public String getColor(){
		return this.color;
	}

	

	///Setter Method
	public void setWidth(int width){
		this.width = width;
	}
	public void setLength(int length){
		this.length = length;
	}
	public void setColor(String color){
		this.color = color;
	}



	///Method
	public int area(){
		return width*length;
	}
	public int perimiter(){
		return (width+length)*2;
	}
/*
	public void compareArea(int area1, int area2){ 

		if(area1 == area2){
			System.out.println("두 직사각형의 넓이가 같습니다.");
			return;
		}
		
		System.out.println( (area1 > area2)? "area1" : "area2" + "가 큽니다."

	}
	public void comparePerimiter(){
		System.out.println();
	}

*/


}//end of class
