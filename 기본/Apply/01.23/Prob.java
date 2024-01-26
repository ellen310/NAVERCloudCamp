//package b.method.ex12

import java.util.*;

public class Prob {

	public static void main(String[] args) {

		int repeat = 4;

		for (int i=1; i<=repeat; i++){

			System.out.print("주어진 숫자까지의 구구단을 찍습니다.\n입력: ");
			Prob.printGugudan( new Scanner(System.in).nextInt() );
			System.out.println("------------Sample"+ i +"-----------");

		}

	}//end of main



	public static void printGugudan(int no){

		if(no<1 || no>9){
			System.out.println("1 이상 9 이하의 값을 입력해야 합니다.");
			return;
		}


		for (int i=1; i<=9; i++){

			for (int j=1; j<=no; j++){

				System.out.print( j+" * "+i+" = "+(j*i)+"\t");

			}
			System.out.println();

		}//end of outer For 		

	}//end of printGugudan()




}//end of class