public class Test3
{
	public static void main(String[] args) 
	{
		int front_num = Integer.parseInt(args[0]);
		int back_num = Integer.parseInt(args[1]);

		if(front_num%3==0){
			if(front_num%2==0){
				System.out.println("1번째 인자값:"+front_num+"은 짝수이며, 3의 배수입니다.");		
			}else{
				System.out.println("1번째 인자값:"+front_num+"은 홀수이며, 3의 배수입니다.");
			}
		}
		else{
			if(front_num%2==0){
				System.out.println("1번째 인자값:"+front_num+"은 짝수이며, 3의 배수가 아닙니다.");		
			}else{
				System.out.println("1번째 인자값:"+front_num+"은 홀수이며, 3의 배수가 아닙니다.");
			}
		}




		if(back_num%3==0){
			if(back_num%2==0){
				System.out.println("2번째 인자값:"+back_num+"은 짝수이며, 3의 배수입니다.");		
			}else{
				System.out.println("2번째 인자값:"+back_num+"은 홀수이며, 3의 배수입니다.");
			}
		}
		else{
			if(back_num%2==0){
				System.out.println("2번째 인자값:"+back_num+"은 짝수이며, 3의 배수가 아닙니다.");		
			}else{
				System.out.println("2번째 인자값:"+back_num+"은 홀수이며, 3의 배수가 아닙니다.");
			}
		}

	}
} 