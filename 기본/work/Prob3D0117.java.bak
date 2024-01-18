//package jb01.part01;

public class Prob3D0117 
{
	public static void main(String[] args) 
	{
		///Field
		int year = 2010;
		int month = 2;
		int maxDay = 0;

		if(month == 2){

			if(year % 4 == 0 && year % 100 == 0){
				maxDay = 28;
			}else if(year % 100 == 0 && year % 400 == 0){
				maxDay = 29;
			}else if(year % 4 == 0){
				maxDay = 29;
			}else{
				maxDay = 28;
			}//end of inner Else

		}else if(month < 8){

			if (month % 2 != 0)
			{
				maxDay = 31;
			}else{
				maxDay = 30;				
			}// end of inner Else

		}else{

			if (month % 2 != 0)
			{
				maxDay = 30;
			}else{
				maxDay = 31;				
			}// end of inner Else

		}//end of outer Else

		System.out.println(year+ "년 "+ month + "월의 말일은 "+maxDay+"일 입니다.");

	}//end of main
}//end of class
