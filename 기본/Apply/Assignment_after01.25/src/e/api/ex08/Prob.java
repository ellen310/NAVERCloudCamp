package e.api.ex08;

public class Prob {

	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = stringSplit(str, "#");
		System.out.println("===문자열 처리 결과===");
		
		for (String s : strs) {
			if(s.equals("")) {
				break;
			}
			System.out.println(s);
		}
		
	}//end of main
	
	
	
	private static String[] stringSplit(String str1, String str2) {
		
		String result[] = new String[str1.length()];
		String parsingString = "";
		
		for(int i=0;i<result.length;i++) {
			result[i]="";
		}
		
		
		for(int i=0;i<str1.length();i++) {
			
			if(str1.charAt(i) == str2.charAt(0) || i==str1.length()-1  ) {
				
				for (int j=0;j<result.length;j++) {
					if(result[j].equals("")){
						result[j] = parsingString;
						parsingString = "";
					}
				}//end of inner For
				
			}else {
				parsingString+=str1.charAt(i);
			}//end of Else
			
		}//end of outer For
		
		return result;
	}//end of stringSplit

}
