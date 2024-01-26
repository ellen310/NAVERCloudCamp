//package d.inheritance.ex02;

abstract public class Shape {

	///Field
	protected double area;
	private String name;




	///Constuctor
	public Shape(){
		super();
	}
	public Shape(String name){
		this.name = name;
	}



	///Getter
	public String getName(){
		return name;
	}
	///Setter
	public void setName(){
		this.name = name;
	}



	///Method
	public void print(){ 
		System.out.println(name+"의 면적은"+area);	
	} 

	///Abstract
	abstract double calculationArea();


}//end of class