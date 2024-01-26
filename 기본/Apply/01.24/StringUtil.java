//package e.api.ex05;

public class StringUtil {

	public static void main(String[] args) {
		
		String[] arr = {"java pogram", "array", "java program area", "append"};
		System.out.println("변경된 문자열 " + StringUtil.replaceString(arr) );
		
	}//end of main


	private static String replaceString(String[] arr){

		int aCount = 0;
		int maxA=0;
		String maxAString= null;

		for (int i=0	; i<arr.length ; i++){

			aCount = 0;
			for (int j=0; j<arr[i].length(); j++){

				if( arr[i].charAt(j) == 'a' ){
					aCount++;
				}

			}//end of inner For

			if(maxA < aCount){
				maxA = aCount;
				maxAString = arr[i];
			}

		}//end of outer For

		return maxAString.replace('a', 'A');
	
	}//end of replaceString

}//end of class