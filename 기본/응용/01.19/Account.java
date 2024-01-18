//package c.modeling.ex02;

public class Account 
{

	///Field
	private final String accNo;
	private int balance;



	///Constructor
	public Account(String accNo){

		this.accNo = accNo;
		System.out.println(accNo+" 계좌가 개설되었습니다.");

	}



	///Getter Method
	public int getBalance(){
		return balance;
	}

	public String getAccNo(){
		return accNo; 
	}

		

	///Method
	public void save(int money){

		balance += money;
		System.out.println(accNo+" 계좌에 "+ money +"만원이 입금되었습니다.");

	}

	public void deposit(int money){

		balance -= money;
		System.out.println(accNo+" 계좌에서 "+ money +"만원이 출금되었습니다.");
	}


}//end of class
