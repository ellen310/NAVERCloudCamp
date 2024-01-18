//package a.base.ex08;

import java.util.Scanner;

public class Prob 
{

	public static void printInvertTriangle(int inputNum, String inputSymbol){

		int space = 0;

		while(inputNum >= 1){
			
			for (int i = 0; i<space; i++)
			{
				System.out.print(" ");
			}
		
			for (int i = 0; i<inputNum ; i++)
			{
				System.out.print(inputSymbol);
			}

			inputNum -= 2;
			space++;
			System.out.println();
		}
	
	}



	public static void main(String[] args) 
	{
		int inputNum = Integer.parseInt(args[0]);		

		if(inputNum == 0 || inputNum < 0 || inputNum % 2 == 0){
			System.out.println("0보다 큰 홀수만 입력 가능합니다");
			return;
		}

		System.out.println("출력하고싶은 기호를 입력하세요: ");
		String inputSymbol = new Scanner(System.in).next();

		printInvertTriangle(inputNum, inputSymbol);

	}//end of main

}//end of class


