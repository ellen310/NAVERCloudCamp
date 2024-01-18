public class JavaArrayIsNotMatrix
{
	public static void main(String[] args) 
	{
		int[][] arr = new int[6][];
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[4];
		arr[4]=new int[1];
		arr[5]=new int[1];


		int value = 0;

		for(int i=0;i<arr.length;i++){                         
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=value;
				value++;
			}//end of inner for
		}//end of outer for


		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
			}//end of inner for
			System.out.println("-------");
		}//end of outer for

	}//end of main
}//end of class  
