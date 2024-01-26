//package d.inheritance.ex02;

//import 

public class Circle  extends Shape{

	///Field 
	private double radius;
	//public static final double PI = 3.14;
	


	///Constuctor
	public Circle(){
		super();
	}
	public Circle(String name, int radius){
		super(name);
		this.radius = radius;
	}



	///Getter
	public double getRadius(){
		return radius;
	}
	///Setter
	public void setRadius(double radius){
		this.radius = radius;
	}

			
	///Method
	public double calculationArea(){

		return area = (radius*radius*Math.PI);	

	}


}//end of class