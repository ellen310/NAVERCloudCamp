package e.api.ex12;

public class Prob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url1 = "http://localhost/order?prodId=PROD-001&prodName=������3&price=980000";
		
		String prodName = getParameter(url1, "prodName");
		System.out.println("��ǰ �̸�: "+prodName);
		
		String url2 = "http://localhost/registUser?userId=USER-001&userName=ȫ�浿&address=����� ������&userAge=26";
		
		String userAddress = getParameter(url2, "address");
		System.out.println("ȸ�� �ּ�: "+ userAddress);
		

	}
	
	private static String getParameter(String url, String paramName) {
		
		String[] splitUrl = url.split("&");
		
		for (int i = 0; i < splitUrl.length; i++) {
			if(splitUrl[i].contains(paramName)) {
				return splitUrl[i].substring( splitUrl[i].indexOf('=')+1, splitUrl[i].length() );
			}
		}
		
		return null;
	}//end of getParameter();

}
