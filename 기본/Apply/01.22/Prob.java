//package a.base.ex09

import java.util.Scanner;

public class  Prob{


	
	public static void printPyramid(int inputNum){

		int maxStar = ( inputNum + (inputNum-1) );
		int countStart = 1;

		for (int i=0; i<inputNum; i++){

			for (int j=0; j<(maxStar/2); j++){
				System.out.print(" ");
			}
			for (int k=0; k<countStart; k++){
				System.out.print("*");
			}
			System.out.println();
			
			maxStar -= 2;
			countStart += 2;

		}//end of outer For

	}//end of printPyramid()	
	


	public static void main(String[] args) {

		Prob.printPyramid(Integer.parseInt(args[0]));
		
	}//end of main
}//end of class