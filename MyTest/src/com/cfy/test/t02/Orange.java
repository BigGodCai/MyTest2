package com.cfy.test.t02;

public class Orange {
	private String code ;
	private Integer count ;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Orange() {
		super();
	}

	public Orange(String code, Integer count) {
		super();
		this.code = code;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Orange [code=" + code + ", count=" + count + "]";
	}
	
	
	
}
