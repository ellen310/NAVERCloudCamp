//package b.method.ex13
import java.util.*;

public class Prob {

	public static void main(String[] args) {

		int limit = 67;

		Util util = new Util();

		int primeCount = util.findPrimeCount(limit);
		System.out.println("1~"+limit+"까지의 소수의 개수는 "+primeCount+"EA이며 소수는 아래와 같다");

		System.out.println("////////////////////////");

		int[] primeArray = util.findPrimeReturnArray(limit);

		for(int i=0; i<primeArray.length;i++){
			System.out.print(primeArray[i]+ ((primeArray.length-1)!=i?",":"") );
		}
		
	}//end of main

}//end of class




class Util {





	public int findPrimeCount(int limit){

		boolean prime = false;
		int primeCnt=0;
		for (int i=3; i < limit+1 ; i++)
		{
			for (int j=2; j < i ; j++)
			{
				if( i % j == 0){  
					prime = false;
					break;
				}
				prime=true;

			}//end of inner For

			if(prime){
				++primeCnt;
			}
		}//end of outer For

		return primeCnt+1;

	}// end of findPrimeCount();










	public int[] findPrimeReturnArray(int limit){

		int[] arr = new int[findPrimeCount(limit)];

		arr[0] = 2;
		for (int i=1; i<arr.length; i++){
			arr[i]=0;
		}


		boolean prime = false;
		for (int i=2; i < limit+1 ; i++)
		{
			for (int j=2; j < i ; j++)
			{
				if( i % j == 0){  
					prime = false;
					break;
				}
				prime=true;

			}//end of inner For

			if(prime){

				for (int k=0; k<arr.length; k++){

					if (arr[k]==0){
						arr[k] = i;
						break;
					}

				}
			}//end of Else

		}//end of outer For

		return arr;

	}//end of findPrimeReturnArray()



}// end of class 