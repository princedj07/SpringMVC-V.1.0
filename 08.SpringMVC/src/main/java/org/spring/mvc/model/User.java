package org.spring.mvc.model;

public class User {

	private String mobile;
	private String password;
	private String mPin;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getmPin() {
		return mPin;
	}

	public void setmPin(String mPin) {
		this.mPin = mPin;
	}

	@Override
	public String toString() {
		return "User [mobile=" + mobile + ", password=" + password + ", mPin=" + mPin + "]";
	}

	
}
