//package e.api.ex03;

//import

public class Prob2 {

	public static void main(String[] args) {

		Prob2 prob = new Prob2();

		System.out.println(prob.leftPad("ABC", 6, '#'));
		System.out.println(prob.leftPad("ABC", 5, '$'));
		System.out.println(prob.leftPad("ABC", 2, '&'));
		
	}//end of main






	public String leftPad(String str, int size, char padChar){

		if (str.length()>size){
			return str;
		}

		String result = "";
		for (int i=0; i<size-str.length() ; i++){
			result += padChar;
		}

		return (result + str);

	}//end of leftPad()


}//end of class