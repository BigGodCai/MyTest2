package com.cfy.test.t03;

public class CustomerInfo {
	private String customerCode;
	private String customerName ;
	private Integer totalAmount ;
	private Integer appleOnHands ;
	private Integer orangeOnHands ;
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getAppleOnHands() {
		return appleOnHands;
	}
	public void setAppleOnHands(Integer appleOnHands) {
		this.appleOnHands = appleOnHands;
	}
	public Integer getOrangeOnHands() {
		return orangeOnHands;
	}
	public void setOrangeOnHands(Integer orangeOnHands) {
		this.orangeOnHands = orangeOnHands;
	}
	public CustomerInfo(String customerCode, String customerName, Integer totalAmount, Integer appleOnHands,
			Integer orangeOnHands) {
		super();
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.totalAmount = totalAmount;
		this.appleOnHands = appleOnHands;
		this.orangeOnHands = orangeOnHands;
	}
	public CustomerInfo() {
		super();
	}
	@Override
	public String toString() {
		return "CustomerInfo [customerCode=" + customerCode + ", customerName=" + customerName + ", totalAmount="
				+ totalAmount + ", appleOnHands=" + appleOnHands + ", orangeOnHands=" + orangeOnHands + "]";
	}
	
	public void name() {
		System.out.println("12345");
	}
	
}
