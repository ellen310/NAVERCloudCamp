//package d.inheritance.ex02;
//import
public class Rectangular extends Shape{

	///Field 
	private double width;
	private double height;


	///Constuctor
	public Rectangular(){
		super();
	}
	public Rectangular(String name, int width, int height){
		super(name);
		this.width = width;
		this.height = height;
	}


	///Getter
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}

	///Setter
	public void setWidth(double width){
		this.width = width;
	}
	public void setHeight(double height){
		this.height = height;
	}

	


	///Method
	public double calculationArea(){

		return area = (width*height);		

	}

		
}//end of class