package f.exception.ex01;

public class CellPhone {
	
	///Field
	private String model;
	private double battery;
	
	
	///Constructor
	public CellPhone() {
	}
	public CellPhone(String model) {
		this.model = model;
	}
	
	
	///Method
	void call(int time) throws IllegalArgumentException {
		
		if(time<0){
			throw new IllegalArgumentException("��ȭ�ð��Է¿���");		
		}else {
			System.out.println("��ȭ �ð�: "+time+" ��");
			battery = ( (battery - (time*0.5))>0 )? battery -= (time*0.5) : 0;
		}
		
	}//end of call
	
	void charge(int time) throws IllegalArgumentException {
		
		if(time<0){
			throw new IllegalArgumentException("��ȭ�ð��Է¿���");		
		}else {
			System.out.println("���� �ð�: "+time+" ��");
			battery = ( (battery + (time*3))<100 )? battery += (time*3) : 100;
		}
		
	}//end of charge()
	
	
	void printBattery() {
		System.out.println("���� ���͸� ��: "+battery);
	}//end of printBattery()
	
	
	@Override
	public boolean equals(Object obj) throws IllegalArgumentException  {

		if(obj instanceof CellPhone) {
			if(this.model == ((CellPhone)obj).model) {
				return true;
			}else {
				return false;
			}
		}else {
			System.out.println("\"CellPhone\"Ÿ���� �ƴմϴ�.");
			throw new IllegalArgumentException();	
		}
		
	}
	
	

	
	
	
}
