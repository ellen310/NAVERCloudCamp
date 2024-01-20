//package b.method.ex05;

public class SortUtil 
{


	public int[] ascending(int[] inputNumbers){


		for (int i=0; i< inputNumbers.length; i++)
		{
			for (int j=(i+1); j<inputNumbers.length; j++)
			{

				if (inputNumbers[i]>inputNumbers[j])
				{
					int tmp = inputNumbers[i];
					inputNumbers[i] = inputNumbers[j];
					inputNumbers[j] = tmp;
				}

			}//end of inner For
		}//end of outer For

		return inputNumbers;
	}//end of ascending()





	public static void main(String[] args) 
	{

		SortUtil util = new SortUtil();
		int[] numbers = new int[] {7,5,2,19,34,51,32,11,67,21};


		numbers = util.ascending(numbers);


		for(int i=0; i<numbers.length;i++){

			System.out.print(numbers[i]);
			System.out.print( (i != numbers.length-1)? "," : "\n" );

		}//end of For

		System.out.println("Successful!!!");


	}//end of main
}//end of class
