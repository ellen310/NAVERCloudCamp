package d.inheritance.ex03;

public class SmartPhone extends CellPhone {
	
	///Field
	private boolean isMonthlyFixedRate;
	private int monthlyFixedFee;
	
	
	
	///Constructor
	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super(phoneNumber, feePerCallTime);
		// TODO Auto-generated constructor stub
	}
	public SmartPhone(String phoneNumber, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		// TODO Auto-generated constructor stub
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
	
	
	///Getters and Setters
	public boolean isMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}
	public void setMonthlyFixedRate(boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}
	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}
	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
	
	
	
	///Method
	@Override
	public void calculationTotalFee() {
		// TODO Auto-generated method stub
		if(isMonthlyFixedRate) {
			super.setTotalFee(monthlyFixedFee);
		}else {
			super.calculationTotalFee();
		}
		
	}
	
	

}
