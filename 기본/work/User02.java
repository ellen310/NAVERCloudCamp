//package jb03.part08;

public class User02 
{

	String name;
	int javalevel;

	public User02(){
		System.out.println("Constructor Method");
		name="ȫ�浿";
		javalevel=0;
	}

	public String getName(){
		return name;
	}

	public int getJavaLevel(){
		return javalevel;
	}


	public static void main(String[] args) 
	{
		System.out.println("============");
		User02 user = new User02();
		System.out.println("============");

		System.out.println("name: "+user.getname());
		System.out.println("javaLevel: "user.getJavalevel());
		

	}//end of main
}//end of class
