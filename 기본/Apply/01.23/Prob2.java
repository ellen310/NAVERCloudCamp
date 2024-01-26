//package e.api.ex01

public class Prob2{

	public static void main(String[] args) {

		String sourceString = "everyday we have is one more than we deserve";
		Prob2.caesarCipher(sourceString);

	}//end of main

	
	public static void caesarCipher(String sourceString){
		
		String encodedString = "";
		
		for (int i=0; i<sourceString.length(); i++){

			if(sourceString.charAt(i) == ' '){
				encodedString += " ";
				continue;
			}

			int parsing = (int)(sourceString.charAt(i));
			parsing = ( (parsing+3)<=122 )? parsing+3 : parsing-23;

			encodedString += (char)parsing;
		}

		System.out.println("암호화 할 문자열: "+ sourceString);
		System.out.println("암호화 할 문자열: "+ encodedString);
	}


}//end of class