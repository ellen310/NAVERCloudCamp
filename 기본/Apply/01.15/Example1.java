public class Example1
{
	public static void main(String[] args) 
	{
		int score = Integer.parseInt(args[0]);
		
		// switch�� ����
		int seperatedScore = score/10;
		switch (separatedScore)
		{
			case 9:
				System.out.println("�Է��Ͻ� �� "+score+"���� \'��\'�Դϴ�.");
			case 8:
				System.out.println("�Է��Ͻ� �� "+score+"���� \'��\'�Դϴ�.");
			case 7:
				System.out.println("�Է��Ͻ� �� "+score+"���� \'��\'�Դϴ�.");
			case 6:
				System.out.println("�Է��Ͻ� �� "+score+"���� \'��\'�Դϴ�.");
			default:
				System.out.println("�Է��Ͻ� �� "+score+"���� \'��\'�Դϴ�.");
		}//end of switch


		/*
		// if�� ����
		if(score>=90){
			System.out.println("�Է��Ͻ� �� "+score+"���� \'��\'�Դϴ�.");
		}else if(score>=80){
			System.out.println("�Է��Ͻ� �� "+score+"���� \'��\'�Դϴ�.");
		}else if(score>=70){
			System.out.println("�Է��Ͻ� �� "+score+"���� \'��\'�Դϴ�.");
		}else if(score>=60){
			System.out.println("�Է��Ͻ� �� "+score+"���� \'��\'�Դϴ�.");
		}else{
			System.out.println("�Է��Ͻ� �� "+score+"���� \'��\'�Դϴ�.");
		}//end of else
		*/


	}//end of main
}//end of calss