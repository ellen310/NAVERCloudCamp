public class Example1
{
	public static void main(String[] args) 
	{
		
		if (args.length==0)
		{
			System.out.println("������ �Է����� �ʾҽ��ϴ�.");
			return;
		}

		int score = Integer.parseInt(args[0]);

		// switch�� ����
		String grade = "��";
		switch (score/10)
		{
			case 10:
			case 9:
				break;
			case 8:
				grade = "��";
				break;
			case 7:
				grade = "��";
				break;
			case 6:
				grade = "��";
				break;
			default:
				grade = "��";
		}//end of switch
		System.out.println("�Է��Ͻ� �� "+score+"���� \'"+grade+"\'�Դϴ�.");


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