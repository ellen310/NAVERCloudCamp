public class Test3
{
	public static void main(String[] args) 
	{

		//for문 + swithch문 버전
		for (int i=0; i<=args.length ; i++)
		{
			int InputNum = Integer.parseInt(args[i]);
			switch(InputNum % 3){
				case 0:
					if(InputNum % 2 == 0){
						System.out.println((i+1)+"번째 인자값:"+InputNum+"은 짝수이며, 3의 배수입니다.");		
					}else{
						System.out.println((i+1)+"번째 인자값:"+InputNum+"은 홀수이며, 3의 배수입니다.");
					}//end of else
					break;

				case 1:
					if(InputNum % 2 == 0){
						System.out.println((i+1)+"번째 인자값:"+InputNum+"은 짝수이며, 3의 배수가 아닙니다.");		
					}else{
						System.out.println((i+1)+"번째 인자값:"+InputNum+"은 홀수이며, 3의 배수가 아닙니다.");
					}//end of else
					break;		

			}//end of switch
		}//end of for


/* ================================================================================================================
		
		//switch문 버전
		int frontNum = Integer.parseInt(args[0]);
		int backNum = Integer.parseInt(args[1]);

		switch(frontNum%3){
			case 0:
				if(frontNum%2==0){
					System.out.println("1번째 인자값:"+frontNum+"은 짝수이며, 3의 배수입니다.");		
				}else{
					System.out.println("1번째 인자값:"+frontNum+"은 홀수이며, 3의 배수입니다.");
				}//end of else
				break;

			case 1:
				if(frontNum%2==0){
					System.out.println("1번째 인자값:"+frontNum+"은 짝수이며, 3의 배수가 아닙니다.");		
				}else{
					System.out.println("1번째 인자값:"+frontNum+"은 홀수이며, 3의 배수가 아닙니다.");
				}//end of else
				break;		
		}//end of switch - frontNum


		switch(backNum%3){
			case 0:
				if(backNum%2==0){
					System.out.println("2번째 인자값:"+backNum+"은 짝수이며, 3의 배수입니다.");		
				}else{
					System.out.println("2번째 인자값:"+backNum+"은 홀수이며, 3의 배수입니다.");
				}//end of else
				break;

			case 1:
				if(backNum%2==0){
					System.out.println("2번째 인자값:"+backNum+"은 짝수이며, 3의 배수가 아닙니다.");		
				}else{
					System.out.println("2번째 인자값:"+backNum+"은 홀수이며, 3의 배수가 아닙니다.");
				}//end of else
				break;		
		}//end of switch - BackNum
*/


/* ================================================================================================================
		
		//if문 버전
		int frontNum = Integer.parseInt(args[0]);
		int backNum = Integer.parseInt(args[1]);

		if(frontNum%3==0){
			if(frontNum%2==0){
				System.out.println("1번째 인자값:"+frontNum+"은 짝수이며, 3의 배수입니다.");		
			}else{
				System.out.println("1번째 인자값:"+frontNum+"은 홀수이며, 3의 배수입니다.");
			}
		}
		else{
			if(frontNum%2==0){
				System.out.println("1번째 인자값:"+frontNum+"은 짝수이며, 3의 배수가 아닙니다.");		
			}else{
				System.out.println("1번째 인자값:"+frontNum+"은 홀수이며, 3의 배수가 아닙니다.");
			}
		}//end of else - frontNum


		if(backNum%3==0){
			if(backNum%2==0){
				System.out.println("2번째 인자값:"+backNum+"은 짝수이며, 3의 배수입니다.");		
			}else{
				System.out.println("2번째 인자값:"+backNum+"은 홀수이며, 3의 배수입니다.");
			}
		}
		else{
			if(backNum%2==0){
				System.out.println("2번째 인자값:"+backNum+"은 짝수이며, 3의 배수가 아닙니다.");		
			}else{
				System.out.println("2번째 인자값:"+backNum+"은 홀수이며, 3의 배수가 아닙니다.");
			}
		}//end of else - BackNum

*/


	}//end of main
}//end of class 