public class Example4
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<=9; i++){
				System.out.println(i+"단을 출력합니다.");

				for(int j = 1; j<=9; j++){
					System.out.println(i+" * "+j+" = "+(j*i));
				}//end of inner for

				System.out.println("==================");
			}//end of outer for
		
	}//end of main
}//end of class  