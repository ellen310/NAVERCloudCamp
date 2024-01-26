//package e.api.ex2;

import java.util.*;

public class Adder2{

	public static void main(String[] args) {
		
		System.out.print("���� ������ �Է��ϼ��� (��: 2+5+7) : ");
		String expr = new Scanner(System.in).next();
		

		try{

			System.out.println(expr+"="+new Adder2().execute(expr));

		}catch(NumberFormatException e){

			System.out.println("e : "+e);
			e.printStackTrace();
			System.out.println("execute()���� NumberFormatException �߻�");

		}catch(Exception e2){

			System.out.println("e2 : "+e2);
			e2.printStackTrace();
			System.out.println("execute()���� Exception �߻�");

		}finally{

			System.out.println("���� ������ �����մϴ�.");

		}


	}//end of main


	public int execute(String expr){

		int result = 0;
		String[] nums = expr.split("\\+");

		 for (int i=0; i<nums.length; i++){
				result += Integer.parseInt(nums[i]);
		 }

		 return result;


	}//end of execute()


}//end of class