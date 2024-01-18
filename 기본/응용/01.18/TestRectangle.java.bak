//package c.modeling.ex01;

import java.util.Scanner;

//import c.modeling.ex01.ans.Rectangle_;

public class TestRectangle 
{
	


		public static void compareArea(Rectangle_ r1, Rectangle_ r2){

			if( r1.area() == r2.area() ){
				System.out.println("두 직사각형의 넓이가 같습니다.");
			}else{
				System.out.print( ( r1.area() > r2.area() )? r1.getColor() : r2.getColor() );
				System.out.println(" 직사각형의 넓이가 큽니다.");
			}

		}//end of compareArea()



		public static void comparePerimiter(Rectangle_ r1, Rectangle_ r2){

			if( r1.perimiter() == r2.perimiter() ){
				System.out.println("두 직사각형의 둘레가 같습니다.");
			}else{
				System.out.print( (r1.perimiter() > r2.perimiter())? r1.getColor() : r2.getColor() );
				System.out.println(" 직사각형의 둘레가 큽니다.");
			}
			
		}//end of comparePerimiter()





	public static void main(String[] s) 
	{
		
		Scanner keyboard = new Scanner(System.in);

		String[] RecElements = {"색깔", "가로", "세로"};

		Rectangle_ rec1 = new Rectangle_();
		Rectangle_ rec2 = new Rectangle_();
		Rectangle_[] rec = {rec1, rec2};


		for (int i = 0; i<rec.length; i++)
		{
			for(int j = 0; j< RecElements.length; j++){

				System.out.println( (i+1)+"번째 직사각형 "+RecElements[j]+": " );

				switch(j){
					case 0:
						rec[i].setColor(keyboard.next());
						break;

					case 1:
						rec[i].setWidth(keyboard.nextInt());
						break;

					case 2:
						rec[i].setLength(keyboard.nextInt());
						break;

				}//end of switch
			                                                                                                 
			}//end of inner For

		}//end of outer For



		for(int i = 0; i<rec.length; i++){
			System.out.println(rec[i].getColor() + " 직사각형의 넓이는" + rec[i].area() + "이고, 둘레는 " +rec[i].perimiter()+"입니다.");
		}


		TestRectangle.compareArea(rec[0], rec[1]);
		TestRectangle.comparePerimiter(rec[0], rec[1]);



	}//end of main

}//end of class
