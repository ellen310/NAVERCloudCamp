public class Test3
{
	public static void main(String[] args) 
	{
		int front_num = Integer.parseInt(args[0]);
		int back_num = Integer.parseInt(args[1]);

		if(front_num%3==0){
			if(front_num%2==0){
				System.out.println("1��° ���ڰ�:"+front_num+"�� ¦���̸�, 3�� ����Դϴ�.");		
			}else{
				System.out.println("1��° ���ڰ�:"+front_num+"�� Ȧ���̸�, 3�� ����Դϴ�.");
			}
		}
		else{
			if(front_num%2==0){
				System.out.println("1��° ���ڰ�:"+front_num+"�� ¦���̸�, 3�� ����� �ƴմϴ�.");		
			}else{
				System.out.println("1��° ���ڰ�:"+front_num+"�� Ȧ���̸�, 3�� ����� �ƴմϴ�.");
			}
		}




		if(back_num%3==0){
			if(back_num%2==0){
				System.out.println("2��° ���ڰ�:"+back_num+"�� ¦���̸�, 3�� ����Դϴ�.");		
			}else{
				System.out.println("2��° ���ڰ�:"+back_num+"�� Ȧ���̸�, 3�� ����Դϴ�.");
			}
		}
		else{
			if(back_num%2==0){
				System.out.println("2��° ���ڰ�:"+back_num+"�� ¦���̸�, 3�� ����� �ƴմϴ�.");		
			}else{
				System.out.println("2��° ���ڰ�:"+back_num+"�� Ȧ���̸�, 3�� ����� �ƴմϴ�.");
			}
		}

	}
} 