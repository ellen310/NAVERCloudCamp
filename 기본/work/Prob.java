//package a.base.ex02;

public class Prob 
{
	public static void main(String[] args) 
	{

		int limit = 50;
		boolean prime = true;


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
				System.out.println(i);
			}

		}//end of outer For

	}//end of main
}//end of class
