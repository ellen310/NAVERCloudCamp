public class Example3
{
	public static void main(String[] args) 
	{

		int smallNum = Integer.parseInt(args[0]);
		int largeNum = Integer.parseInt(args[1]);
		if (smallNum>largeNum)
		{
			int tmp = largeNum;
			largeNum = smallNum;
			smallNum = tmp;
		}


		int sum=0;
		for (int i=smallNum; i<=largeNum; i++)
		{
			sum += i;
		}


		if(sum==smallNum){
			System.out.println("입력값이 같습니다!!!");
		}else{
			System.out.println(smallNum +" ~ "+largeNum+"의 합은 "+sum+"입니다.");
		}


		
	}//end of main
}//end of class