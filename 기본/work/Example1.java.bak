public class Example1
{
	public static void main(String[] args) 
	{
		
		if (args.length==0)
		{
			System.out.println("성적을 입력하지 않았습니다.");
			return;
		}

		int score = Integer.parseInt(args[0]);

		// switch문 버전
		String grade = "수";
		switch (score/10)
		{
			case 10:
			case 9:
				break;
			case 8:
				grade = "우";
				break;
			case 7:
				grade = "미";
				break;
			case 6:
				grade = "양";
				break;
			default:
				grade = "가";
		}//end of switch
		System.out.println("입력하신 값 "+score+"점은 \'"+grade+"\'입니다.");


		/*
		// if문 버전
		if(score>=90){
			System.out.println("입력하신 값 "+score+"점은 \'수\'입니다.");
		}else if(score>=80){
			System.out.println("입력하신 값 "+score+"점은 \'우\'입니다.");
		}else if(score>=70){
			System.out.println("입력하신 값 "+score+"점은 \'미\'입니다.");
		}else if(score>=60){
			System.out.println("입력하신 값 "+score+"점은 \'양\'입니다.");
		}else{
			System.out.println("입력하신 값 "+score+"점은 \'가\'입니다.");
		}//end of else
		*/


	}//end of main
}//end of calss