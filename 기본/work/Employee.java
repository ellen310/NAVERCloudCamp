//package jb01.part01;

public class Employee 
{
	String part;
	String name;
	int age;
	int baseSalary;

	public Employee(){
		System.out.println("Emp의 default Constructor");
	}

	public Employee(String str){ //str이라하니 식별성&가독성 떨어지잖아. 그니까 name으로 해
		name=str; //변수는 brace종속적. 가까운 brace를 기준으로한다. 즉, str을 name으로 바꾼다면, name은 1-Class의 name, 2-파라미터의 name 이렇게 두개가 생긴다. 
		//this.name = name //여기서 name은 이 Class의 name이 아니라, 파라미터로 온 name(수정 전 str에 해당하는 값)으로 인식한다. 그러므로 Class의 name은 this.name으로 가리켜줄 필요가 생긴다. 
		System.out.println("Emp의 name을 받는 Constructor");
	}

	public Employee(String str1, String str2){
		this(str1);
		part=str2;
		System.out.println("Emp의 name,part를 받는 Constructor");
	}

	public Employee(String str1, String str2, int i){
		this(str1, str2);
		age=i;
		System.out.println("Emp의 name,part,age를 받는 Constructor");
	}

	public int salary(){
		System.out.println("Emp의 Salary() method");
		baseSalary = 100;
		return baseSalary;
	}

}//end of class
