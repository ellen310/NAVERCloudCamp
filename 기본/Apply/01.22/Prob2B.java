//package c.modeling.ex03;


abstract class Human {

	///Field 
	private String name;
	private int age;


	///Constructor Method
	public Human(){
	}
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}


	///Getter Method
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}


	///Setter Method
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}


	///Abstract Method
	abstract void print();


}// end of class 









class Student extends Human{

	///Field
	private int id;

	///Constructor Method
	public Student(){
	}
	public Student(String name, int age, int id){
		super(name, age);
		this.id = id;
	}

	///Getter Method
	public int getId(){
		return id;
	}

	///Setter Method
	public void setId(int id){
		this.id = id;
	}

	///Method
	public void print(){
		System.out.println("이 름: "+super.getName()+"    나 이: "+super.getAge()+"    학 번: "+id);
	}

}// end of class 









class Teacher extends Human{

	///Field
	private String subject;


	///Constructor Method
	public Teacher(){
	}
	public Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}


	///Getter Method
	public String getSubject(){
		return subject;
	}

	///Setter Method
	public void setSubject(String subject){
		this.subject = subject;
	}


	///Method
	public void print(){
		System.out.println("이 름: "+super.getName()+"    나 이: "+super.getAge()+"    담당과목: "+subject);
	}

}// end of class 










class Employee extends Human{

	///Field
	private String dept;


	///Constructor Method
	public Employee(){
	}
	public Employee(String name, int age, String dept){
		super(name, age);
		this.dept = dept;
	}


	///Getter Method
	public String getDeptt(){
		return dept;
	}

	///Setter Method
	public void setDeptt(String dept){
		this.dept = dept;
	}


	///Method
	public void print(){
		System.out.println("이 름: "+super.getName()+"    나 이: "+super.getAge()+"    부 서: "+dept);
	}

}// end of class 









public class  Prob2B{

	public static void main(String[] args) {

		Human s = new Student("홍길동", 20, 200201);
		Human t = new Teacher("이순신", 30, "JAVA");
		Human e = new Employee("유관순", 40, "교무과");

		Human[] humanInfo = {s,t,e};



		for (int i=0; i<humanInfo.length; i++){
			humanInfo[i].print();
		}



	}//end of main

}//end of class