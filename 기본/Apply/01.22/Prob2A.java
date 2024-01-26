//package c.modeling.ex03;
//import


class Student {

	///Field
	private String name;
	private int age;
	private int id;

	///Constructor Method
	public Student(){
	}
	public Student(String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}

	///Getter Method
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getId(){
		return id;
	}

	///Setter Method
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setId(int id){
		this.id = id;
	}

	///Method
	public void print(){
		System.out.println("�� ��: "+name+"    �� ��: "+age+"    �� ��: "+id);
	}

}// end of class 








class Teacher {

	///Field
	private String name;
	private int age;
	private String subject;


	///Constructor Method
	public Teacher(){
	}
	public Teacher(String name, int age, String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}


	///Getter Method
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getSubject(){
		return subject;
	}

	///Setter Method
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setSubject(String subject){
		this.subject = subject;
	}


	///Method
	public void print(){
		System.out.println("�� ��: "+name+"    �� ��: "+age+"    ������: "+subject);
	}

}// end of class 










class Employee {

	///Field
	private String name;
	private int age;
	private String dept;


	///Constructor Method
	public Employee(){
	}
	public Employee(String name, int age, String dept){
		this.name = name;
		this.age = age;
		this.dept = dept;
	}


	///Getter Method
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getDeptt(){
		return dept;
	}

	///Setter Method
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setDeptt(String dept){
		this.dept = dept;
	}


	///Method
	public void print(){
		System.out.println("�� ��: "+name+"    �� ��: "+age+"    �� ��: "+dept);
	}

}// end of class 









public class  Prob2A{

	public static void main(String[] args) {

		Student s = new Student("ȫ�浿", 20, 200201);
		Teacher t = new Teacher("�̼���", 30, "JAVA");
		Employee e = new Employee("������", 40, "������");

		s.print();
		t.print();
		e.print();
		
	}//end of main

}//end of class