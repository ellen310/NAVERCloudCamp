//package jb01.part01;

import java.util.Scanner;

public class FactorialUtil 
{


	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input = " );

		System.out.println("Result = " + new FactorialUtil().factorial(keyboard.nextInt()) );


	}//end of main




	public int factorial(int n){
		
		if (n==1)
		{
			return 1;
		}else{
			return factorial(n-1) * n;
		}

	}//end of factorial()





}//end of class
