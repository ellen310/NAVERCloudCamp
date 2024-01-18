//package c.modeling.ex02;

public class Account 
{

	///Field
	private final String accNo;
	private int balance;



	///Constructor
	public Account(String accNo){

		this.accNo = accNo;
		System.out.println(accNo+" ���°� �����Ǿ����ϴ�.");

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
		System.out.println(accNo+" ���¿� "+ money +"������ �ԱݵǾ����ϴ�.");

	}

	public void deposit(int money){

		balance -= money;
		System.out.println(accNo+" ���¿��� "+ money +"������ ��ݵǾ����ϴ�.");
	}


}//end of class
