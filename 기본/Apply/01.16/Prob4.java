//package a.base.ex01;

import java.util.Scanner;

public class Prob4  
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���.:");
		int inputInt = keyboard.nextInt();

		if(inputInt<2 || inputInt>9){
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
			return;
		}//end of If

		for(int i = 1; i<=9; i++){
			System.out.println(inputInt+" * "+i+" = "+(inputInt*i));
		}//end of For


	}//end of main
}//end of class
