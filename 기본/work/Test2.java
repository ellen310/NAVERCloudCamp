public class Test2
{
	public static void main(String[] args) 
	{
		int frontNum = Integer.parseInt(args[0]);
		int backNum = Integer.parseInt(args[1]);
		int result = 0;

		//switch문 버전
		int isFrontBigger = (frontNum > backNum)? 1 : 0; //1: true, 0: false
		switch(isFrontBigger){
			case 1:
				result = frontNum - backNum;
				System.out.println("첫번째인수:"+frontNum+", 두번째인수:"+backNum+", "+frontNum+ "-"+backNum+"="+result+"입니다.");		
				break;

			case 0:
				result = frontNum + backNum;
				System.out.println("첫번째인수:"+frontNum+", 두번째인수:"+backNum+", "+frontNum+ "+"+backNum+"="+result+"입니다.");
				break;
		
		}//end of switch


		
		/*
		//if문 버전 - 01월.12일 과제물
		if(front_num > back_num){
			result = front_num - back_num;
			System.out.println("첫번째인수:"+front_num+", 두번째인수:"+back_num+", "+front_num+ "-"+back_num+"="+result+"입니다.");		
		}else{
			result = front_num + back_num;
			System.out.println("첫번째인수:"+front_num+", 두번째인수:"+back_num+", "+front_num+ "+"+back_num+"="+result+"입니다.");
		}//end of else
		*/

	}//end of main
}//end of class
