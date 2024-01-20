//package a.base.ex06;

public class Prob2D0117 
{
	public static void main(String[] args) 
	{
		
		int[] array = {3,24,1,55,17,43,5};




		for (int i=0; i< array.length; i++)
		{
			for (int j=(i+1); j<array.length; j++)
			{

				if (array[i]>array[j])
				{
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}

			}//end of inner For
		}//end of outer For





		for (int i=0; i< array.length; i++){

			if(i == array.length-1){
				System.out.println(array[i]);
				return;
			}

			System.out.print(array[i]+", ");
		}//end of For


		

	}//end of main
}//end of class
