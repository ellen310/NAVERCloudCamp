//package a.base.ex05;

public class Prob4D0117 
{
	public static void main(String[] args) 
	{
		int num1 = 6;
		int num2 = 15;
		
		Prob4D0117 prob = new Prob4D0117();
		System.out.println("두 수의 차는 "+prob.abs(num1, num2));

	}//end of main

	
	public int abs(int num1, int num2){
		
		return ( num1-num2 < 0 )? num2-num1 : num1-num2;

	}//end of abs()



}//end of class
