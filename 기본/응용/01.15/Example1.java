public class Example1
{
	public static void main(String[] args) 
	{
		int score = Integer.parseInt(args[0]);
		
		// switch문 버전
		int seperatedScore = score/10;
		switch (separatedScore)
		{
			case 9:
				System.out.println("입력하신 값 "+score+"점은 \'수\'입니다.");
			case 8:
				System.out.println("입력하신 값 "+score+"점은 \'우\'입니다.");
			case 7:
				System.out.println("입력하신 값 "+score+"점은 \'미\'입니다.");
			case 6:
				System.out.println("입력하신 값 "+score+"점은 \'양\'입니다.");
			default:
				System.out.println("입력하신 값 "+score+"점은 \'가\'입니다.");
		}//end of switch


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