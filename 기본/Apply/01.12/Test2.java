public class Test2
{
	public static void main(String[] args) 
	{
		int front_num = Integer.parseInt(args[0]);
		int back_num = Integer.parseInt(args[1]);
		int result = 0;

		if(front_num > back_num){
			result = front_num - back_num;
			System.out.println("ù��°�μ�:"+front_num+", �ι�°�μ�:"+back_num+", "+front_num+ "-"+back_num+"="+result+"�Դϴ�.");		
		}else{
			result = front_num + back_num;
			System.out.println("ù��°�μ�:"+front_num+", �ι�°�μ�:"+back_num+", "+front_num+ "+"+back_num+"="+result+"�Դϴ�.");
		}

	}
}  
