//package b.method.ex04;

public class Prob1D0118 
{
	

	public static void main(String[] args) 
	{
		int month = Integer.parseInt(args[0]);
		new Prob1D0118().printSeason(month);

	}//end of main



	public void printSeason(int month){

		String birthSeason;

		switch(month){

			case 3:
			case 4:
			case 5:
				birthSeason = "��";
				break;

			case 6:
			case 7:
			case 8:
				birthSeason = "����";
				break;

			case 9:
			case 10:
			case 11:
				birthSeason = "����";
				break;

			case 12:
			case 1:
			case 2:
				birthSeason = "�ܿ�";
				break;

			default: 
				System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
				return;

		}//end of switch
		
		System.out.println(birthSeason+"�� �¾�̳׿�!");

	}//end of printSeason()


}//end of class
