//package jb05.part03;

class TopSecret01
{
	///Field
	int secretNo = 7777;

	///Constructor
	public TopSecret01()
	{
	}
	
	///getter Method
	public int getSecretNo(){
		return secretNo;
	}

}//end of class



public class ModifierTest01 
{
	public static void main(String[] args) 
	{

		TopSecret01 topSecret = new TopSecret01();
		System.out.println(topSecret.secretNo);

	}//end of main


}//end of class
