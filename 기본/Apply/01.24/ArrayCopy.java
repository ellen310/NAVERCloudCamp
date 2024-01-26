//package e.api.ex04;
import java.util.Vector;

public class ArrayCopy{


	public static List <String> moveToVector(String []datas){

		List<String> vec = new Vector<>();

		for(int i=datas.length; i>0; i--){
			vec.add(datas[i-1]);
		}

		return vec;
	}



	public static void main(String[] args) {
		ArrayCopy ac = new ArrayCopy();
		String datas[] = {"1","2","3","4","5"};

		System.out.println(ac.moveToVector(datas) + "의 순서로 저장된 Vector");
		
	}//end of main
}//end of class