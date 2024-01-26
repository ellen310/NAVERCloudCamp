package d.inheritance.ex03;

public class CellPhone {
	
	///Field
	private String phoneNumber;
	private int totalCallTime;
	private int totalFee;
	private int feePerCallTime;
	

	
	
	///Constructor
	public CellPhone() {
	}
	public CellPhone(String phoneNumber, int feePerCallTime) {
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}
	
	
	
	
	///Getters and Setters
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getTotalCallTime() {
		return totalCallTime;
	}
	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
	public int getFeePerCallTime() {
		return feePerCallTime;
	}
	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
	
	
	
	
	///Method
	public void call(String phoneNumber, int totalCallTime) {
		System.out.println(phoneNumber+" 번호로 "+totalCallTime+"통화함.");
		this.totalCallTime += totalCallTime;
	}
	
	public void calculationTotalFee(){
		totalFee += (feePerCallTime*totalCallTime);
	}

}
