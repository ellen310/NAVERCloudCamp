public class Example2
{
	public static void main(String[] args) 
	{
		int InputNum = Integer.parseInt(args[0]);
		
		if(InputNum <= 0 || InputNum >= 10){
			for(int i = 1; i<=9; i++){
				System.out.println(i+"���� ����մϴ�.");
				for(int j = 1; j<=9; j++){
					System.out.println(i+" * "+j+" = "+(j*i));
				}//end of inner for
				System.out.println("==================");
			}//end of outer for
		}else{
			System.out.println(InputNum+"���� ����մϴ�.");
			for(int i = 1; i<=9; i++){				
				System.out.println(InputNum+" * "+i+" = "+(InputNum*i));
			}//end of for
		}//end of else

		
	}//end of main
}//end of class  