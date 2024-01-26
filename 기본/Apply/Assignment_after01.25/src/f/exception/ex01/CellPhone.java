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
			throw new IllegalArgumentException("통화시간입력오류");		
		}else {
			System.out.println("통화 시간: "+time+" 분");
			battery = ( (battery - (time*0.5))>0 )? battery -= (time*0.5) : 0;
		}
		
	}//end of call
	
	void charge(int time) throws IllegalArgumentException {
		
		if(time<0){
			throw new IllegalArgumentException("통화시간입력오류");		
		}else {
			System.out.println("충전 시간: "+time+" 분");
			battery = ( (battery + (time*3))<100 )? battery += (time*3) : 100;
		}
		
	}//end of charge()
	
	
	void printBattery() {
		System.out.println("남은 배터리 양: "+battery);
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
			System.out.println("\"CellPhone\"타입이 아닙니다.");
			throw new IllegalArgumentException();	
		}
		
	}
	
	

	
	
	
}
