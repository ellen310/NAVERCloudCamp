//package a.base.ex03;

import java.util.Scanner;

public class Prob2 
{
	public static void main(String[] args) 
	{

		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���.: ");

		int inputInt = keyboard.nextInt();

		if(inputInt<2 || inputInt>9){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			return;
		}



		for (int i=1; i<=inputInt ; i++)
		{
			int result = 1;
			for (int j=1; j<=i ; j++)
			{
				result *= j;
			}//end of outer For

			System.out.println(i+"! = "+result);
		}//end of inner For



	}//end of main
}//end of class
