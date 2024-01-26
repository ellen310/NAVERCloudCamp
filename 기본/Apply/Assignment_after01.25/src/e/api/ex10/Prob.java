package e.api.ex10;

import java.util.List;
import java.util.Vector;

public class Prob {
	
	public List<StringBuilder> dataChange(String[] strData){
		
		List<StringBuilder> list = new Vector<>();
		
		for(int i=strData.length; i>0;i--) {
			StringBuilder str = new StringBuilder(strData[i-1]);
			list.add(str.reverse());
		}
		
		return list;
		
	}//end of dataChange()
	
	

	public static void main(String[] args) {
		
		Prob st = new Prob();
		String[] strData = {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet"};
		List<StringBuilder> v = st.dataChange(strData);
		
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}

	}//end of class

}
