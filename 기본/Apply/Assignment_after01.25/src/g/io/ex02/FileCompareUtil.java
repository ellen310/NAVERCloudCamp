package g.io.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileCompareUtil {
	
	/*
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return this.
		
		System.out.println("LINE 1: "+this.get(0));
		System.out.println("LINE 1: "+this.get(1));
	}*/
	

	public List compareFile(String fstFileName, String scdFileName) throws Exception {
		
		List<String> list = new ArrayList<>();
		
		BufferedReader br1 = new BufferedReader(new FileReader(fstFileName));
		BufferedReader br2 = new BufferedReader(new FileReader(scdFileName));
		
		String currentBr2 = null;
		while(true) {
			
			if( (currentBr2 = br2.readLine()) != null ) {
				if( !(br1.readLine().equals(currentBr2)) ) {
					list.add(currentBr2);
				}
			}else {
				break;
			}
		}
		
		return list;
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileCompareUtil util = new FileCompareUtil();
		System.out.println(util.compareFile("./files/fstFile1.txt", "./files/scdFile1.txt"));
		
		
	}

}
