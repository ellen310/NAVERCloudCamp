//package jb01.part01;

public class HanmiBank extends Bank implements Deposit,PayOut 
{

	///Constructor
	public HanmiBank(){
	}

	public HanmiBank(String name){
		super(name);
	}


	///Method
	public void display(int money){
		System.out.println("은행명:"+ this.getName());
	}

	public void deposit(int money){
		System.out.println(money+"를 입금합니다.");
	}

	public void payOut(int money){
		System.out.println(money+"를 출금합니다.");
	}

	



	public static void main(String[] args) 
	{
		HanmiBank hb = new HanmiBank("한미은행");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);

		System.out.println(Deposit.deposit);  //Deposit은 Interface라서, 모든 필드가 static final 타입이다. 거기에는 그냥 String deposit이라고 쓰여있어도, static final이 생략되어있는거다.
		System.out.println(hb.payOut); //payOut도 PayOut이란 인터페이스 내에 있는 변수이니, hb로 객체생성해서 하지말고. PayOut.payOut으로 해주자

	}//end of main


}//end of class
