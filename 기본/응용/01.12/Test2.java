public class Test2
{
	public static void main(String[] args) 
	{
		int front_num = Integer.parseInt(args[0]);
		int back_num = Integer.parseInt(args[1]);
		int result = 0;

		if(front_num > back_num){
			result = front_num - back_num;
			System.out.println("첫번째인수:"+front_num+", 두번째인수:"+back_num+", "+front_num+ "-"+back_num+"="+result+"입니다.");		
		}else{
			result = front_num + back_num;
			System.out.println("첫번째인수:"+front_num+", 두번째인수:"+back_num+", "+front_num+ "+"+back_num+"="+result+"입니다.");
		}

	}
}  
