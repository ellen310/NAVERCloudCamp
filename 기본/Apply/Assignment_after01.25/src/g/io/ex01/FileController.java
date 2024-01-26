package g.io.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Stack;

public class FileController {
	
	public void reverseLine(String inputFileName, String outputFileName) throws Exception{
		
		Stack<String> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new FileReader(inputFileName));
		
		String currentStr = null;
		while(true) {
			
			if((currentStr = br.readLine()) == null) {
				break;
			}
			
			System.out.println(currentStr);
			stack.push(currentStr);
		}
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));
		currentStr = null;
		while(true) {
			
			if( stack.isEmpty() ) {
				break;
			}
			
			currentStr = stack.pop();
			System.out.println(currentStr);
			bw.write(currentStr+"\n");
			
		}
		bw.flush();
		
		bw.close();
		br.close();
		
		
	}//end of reverseLine()

	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileController c = new FileController();
		String oldf = "files/oldf.txt";
		String newf = "files/newf.txt";
		c.reverseLine(oldf, newf);
	}

}
