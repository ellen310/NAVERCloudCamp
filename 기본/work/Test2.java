public class Test2
{
	public static void main(String[] args) 
	{
		int frontNum = Integer.parseInt(args[0]);
		int backNum = Integer.parseInt(args[1]);
		int result = 0;

		//switch�� ����
		int isFrontBigger = (frontNum > backNum)? 1 : 0; //1: true, 0: false
		switch(isFrontBigger){
			case 1:
				result = frontNum - backNum;
				System.out.println("ù��°�μ�:"+frontNum+", �ι�°�μ�:"+backNum+", "+frontNum+ "-"+backNum+"="+result+"�Դϴ�.");		
				break;

			case 0:
				result = frontNum + backNum;
				System.out.println("ù��°�μ�:"+frontNum+", �ι�°�μ�:"+backNum+", "+frontNum+ "+"+backNum+"="+result+"�Դϴ�.");
				break;
		
		}//end of switch


		
		/*
		//if�� ���� - 01��.12�� ������
		if(front_num > back_num){
			result = front_num - back_num;
			System.out.println("ù��°�μ�:"+front_num+", �ι�°�μ�:"+back_num+", "+front_num+ "-"+back_num+"="+result+"�Դϴ�.");		
		}else{
			result = front_num + back_num;
			System.out.println("ù��°�μ�:"+front_num+", �ι�°�μ�:"+back_num+", "+front_num+ "+"+back_num+"="+result+"�Դϴ�.");
		}//end of else
		*/

	}//end of main
}//end of class
