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
		System.out.println("�����:"+ this.getName());
	}

	public void deposit(int money){
		System.out.println(money+"�� �Ա��մϴ�.");
	}

	public void payOut(int money){
		System.out.println(money+"�� ����մϴ�.");
	}

	



	public static void main(String[] args) 
	{
		HanmiBank hb = new HanmiBank("�ѹ�����");
		hb.display();
		hb.deposit(100);
		hb.payOut(200);

		System.out.println(Deposit.deposit);  //Deposit�� Interface��, ��� �ʵ尡 static final Ÿ���̴�. �ű⿡�� �׳� String deposit�̶�� �����־, static final�� �����Ǿ��ִ°Ŵ�.
		System.out.println(hb.payOut); //payOut�� PayOut�̶� �������̽� ���� �ִ� �����̴�, hb�� ��ü�����ؼ� ��������. PayOut.payOut���� ������

	}//end of main


}//end of class
