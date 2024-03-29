//package jb05.part04.test04;

	
abstract class BusCharge{

	String section;

	public BusCharge(){
	}

	public BusCharge(String section){
		this.section = section;
	}

	public void information(){
		System.out.println("버스요금안내");
	}

	public abstract void charge();

}//end of class 



class Student extends BusCharge
{
	public Student(){
		super("학생");
	}

	public void charge(){
		System.out.println(" :: 300원");
	}

}//end of class





class Adult extends BusCharge
{
	public Adult(){
		super("일반인");
	}

	public void charge(){
		System.out.println(" :: 500원");
	}

}//end of class




class Old extends BusCharge
{
	public Old(){
		super("어르신");
	}

	public void charge(){
		System.out.println(" :: 공짜");
	}

}//end of class





public class Display03 
{
	public static void main(String[] args) 
	{
		BusCharge bc1 = new Student();
		BusCharge bc2 = new Adult();
		BusCharge bc3 = new Old();


/*
		bc1.information();
		System.out.print(bc1.section);
		bc1.charge();

		bc2.information();
		System.out.print(bc2.section);
		bc2.charge();

		bc3.information();
		System.out.print(bc3.section);
		bc3.charge();
*/

		BusCharge[] bc = new BusCharge[3];
		bc[0] = new Student();
		bc[1] = new Adult();
		bc[2] = new Old();

		for(int i=0;i<bc.length;i++){
			bc[i].information();
			System.out.print(bc[i].section);
			bc[i].charge();
		}


	}//end of main
}//end of class
