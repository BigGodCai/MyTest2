package com.cfy.test.t01;

public class Apple {
	private String customerCode;
	private String customerName;
	private Integer count;
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
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Apple(String customerCode, String customerName, Integer count) {
		super();
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.count = count;
	}
	public Apple() {
		super();
	}
	@Override
	public String toString() {
		return "Apple [customerCode=" + customerCode + ", customerName=" + customerName + ", count=" + count + "]";
	}
	
	
}
