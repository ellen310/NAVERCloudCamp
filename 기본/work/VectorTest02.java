//package jb01.part05;

import java.util.*;

public class VectorTest02 extends Vector
{

	public VectorTest02(){
	}

	public VectorTest02(int initialCapacity, int capacityIncrement){
		super(initialCapacity, capacityIncrement);
	}

	public void pringString(Vector vector){
		for(Object object:vector){
			System.out.print( (String)object );
		}
	}


	public static void main(String[] args) 
	{

		VectorTest02 vectorTest = new VectorTest02(10,10);

		String s1 = new String("1.»´");
		vector.add(s1);
		vector.add(new String("2.µø"));
		vector.add("3.¥‘ æ»≥Á«œººø‰");

		vectorTest.pringString(vectorTest);

		System.out.println("\n ==> API »Æ¿Œ");
		vector.insertElementAt("4.±Ê", 1);
		vectorTest.pringString(vectorTest);

		System.out.println("\n ==> API »Æ¿Œ");
		vector.setElementAt("5.»´±Êº¯", 3);
		vectorTest.pringString(vectorTest);

		System.out.println("\n ==> API »Æ¿Œ");
		vector.removeElementAt(3);
		vectorTest.pringString(vectorTest);



	}//end of main
}//end of class
