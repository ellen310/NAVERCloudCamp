public class Test3
{
	public static void main(String[] args) 
	{

		//for�� + swithch�� ����
		for (int i=0; i<=args.length ; i++)
		{
			int InputNum = Integer.parseInt(args[i]);
			switch(InputNum % 3){
				case 0:
					if(InputNum % 2 == 0){
						System.out.println((i+1)+"��° ���ڰ�:"+InputNum+"�� ¦���̸�, 3�� ����Դϴ�.");		
					}else{
						System.out.println((i+1)+"��° ���ڰ�:"+InputNum+"�� Ȧ���̸�, 3�� ����Դϴ�.");
					}//end of else
					break;

				case 1:
					if(InputNum % 2 == 0){
						System.out.println((i+1)+"��° ���ڰ�:"+InputNum+"�� ¦���̸�, 3�� ����� �ƴմϴ�.");		
					}else{
						System.out.println((i+1)+"��° ���ڰ�:"+InputNum+"�� Ȧ���̸�, 3�� ����� �ƴմϴ�.");
					}//end of else
					break;		

			}//end of switch
		}//end of for


/* ================================================================================================================
		
		//switch�� ����
		int frontNum = Integer.parseInt(args[0]);
		int backNum = Integer.parseInt(args[1]);

		switch(frontNum%3){
			case 0:
				if(frontNum%2==0){
					System.out.println("1��° ���ڰ�:"+frontNum+"�� ¦���̸�, 3�� ����Դϴ�.");		
				}else{
					System.out.println("1��° ���ڰ�:"+frontNum+"�� Ȧ���̸�, 3�� ����Դϴ�.");
				}//end of else
				break;

			case 1:
				if(frontNum%2==0){
					System.out.println("1��° ���ڰ�:"+frontNum+"�� ¦���̸�, 3�� ����� �ƴմϴ�.");		
				}else{
					System.out.println("1��° ���ڰ�:"+frontNum+"�� Ȧ���̸�, 3�� ����� �ƴմϴ�.");
				}//end of else
				break;		
		}//end of switch - frontNum


		switch(backNum%3){
			case 0:
				if(backNum%2==0){
					System.out.println("2��° ���ڰ�:"+backNum+"�� ¦���̸�, 3�� ����Դϴ�.");		
				}else{
					System.out.println("2��° ���ڰ�:"+backNum+"�� Ȧ���̸�, 3�� ����Դϴ�.");
				}//end of else
				break;

			case 1:
				if(backNum%2==0){
					System.out.println("2��° ���ڰ�:"+backNum+"�� ¦���̸�, 3�� ����� �ƴմϴ�.");		
				}else{
					System.out.println("2��° ���ڰ�:"+backNum+"�� Ȧ���̸�, 3�� ����� �ƴմϴ�.");
				}//end of else
				break;		
		}//end of switch - BackNum
*/


/* ================================================================================================================
		
		//if�� ����
		int frontNum = Integer.parseInt(args[0]);
		int backNum = Integer.parseInt(args[1]);

		if(frontNum%3==0){
			if(frontNum%2==0){
				System.out.println("1��° ���ڰ�:"+frontNum+"�� ¦���̸�, 3�� ����Դϴ�.");		
			}else{
				System.out.println("1��° ���ڰ�:"+frontNum+"�� Ȧ���̸�, 3�� ����Դϴ�.");
			}
		}
		else{
			if(frontNum%2==0){
				System.out.println("1��° ���ڰ�:"+frontNum+"�� ¦���̸�, 3�� ����� �ƴմϴ�.");		
			}else{
				System.out.println("1��° ���ڰ�:"+frontNum+"�� Ȧ���̸�, 3�� ����� �ƴմϴ�.");
			}
		}//end of else - frontNum


		if(backNum%3==0){
			if(backNum%2==0){
				System.out.println("2��° ���ڰ�:"+backNum+"�� ¦���̸�, 3�� ����Դϴ�.");		
			}else{
				System.out.println("2��° ���ڰ�:"+backNum+"�� Ȧ���̸�, 3�� ����Դϴ�.");
			}
		}
		else{
			if(backNum%2==0){
				System.out.println("2��° ���ڰ�:"+backNum+"�� ¦���̸�, 3�� ����� �ƴմϴ�.");		
			}else{
				System.out.println("2��° ���ڰ�:"+backNum+"�� Ȧ���̸�, 3�� ����� �ƴմϴ�.");
			}
		}//end of else - BackNum

*/


	}//end of main
}//end of class 