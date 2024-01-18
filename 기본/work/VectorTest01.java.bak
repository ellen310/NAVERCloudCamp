//package jb01.part05;

import java.util.*;

public class VectorTest01 
{
	public static void main(String[] args) 
	{

		Vector vector = new Vector(10,10);

		String s1 = new String("1.È«");
		vector.add(s1);
		vector.add(new String("2.µ¿"));
		vector.add("3.´Ô ¾È³çÇÏ¼¼¿ä");

		for(int i=0;i<vector.size();i++){
			Object obj = vector.elementAt(i);
			String s = (String)obj;
			//Stirng s = (String)vector.element(i);
			System.out.print(s);
			//System.out.print( (String)vector.elementAt(i) );
		}

		System.out.println("\n ==> API È®ÀÎ");
		vector.insertElementAt("4.±æ", 1);
		for(int i=0;i<vector.size();i++){
			System.out.print( (String)vector.elementAt(i) );
		}

		System.out.println("\n ==> API È®ÀÎ");
		vector.setElementAt("5.È«±æ¼ø", 3);
		for(int i=0;i<vector.size();i++){
			System.out.print( (String)vector.elementAt(i) );
		}

		System.out.println("\n ==> API È®ÀÎ");
		vector.removeElementAt(3);
		for(int i=0;i<vector.size();i++){
			System.out.print( (String)vector.elementAt(i) );
		}





	}//end of main
}//end of class
