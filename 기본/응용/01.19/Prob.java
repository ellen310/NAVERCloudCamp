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
			System.out.println("0���� ū Ȧ���� �Է� �����մϴ�");
			return;
		}

		System.out.println("����ϰ���� ��ȣ�� �Է��ϼ���: ");
		String inputSymbol = new Scanner(System.in).next();

		printInvertTriangle(inputNum, inputSymbol);

	}//end of main

}//end of class


