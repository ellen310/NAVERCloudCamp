public class Example5
{
	public static void main(String[] args) 
	{

		String[][] MultiplicationTable = new String[9][9];

		for(int i=0; i<MultiplicationTable.length ;i++){
			System.out.println((i+1)+"단을 출력합니다.");

			for(int j=0; j<MultiplicationTable[i].length ;j++){
				MultiplicationTable[i][j] = (i+1) +" * "+ (j+1) +" = "+ ((i+1)*(j+1));
				System.out.println(MultiplicationTable[i][j]);
			}// end of inner

			System.out.println("=======================");
		}//end of outer


	}//end of main
}//end of class  