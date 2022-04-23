package com.emd;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address
{
	@Column(length=30)
    private String state;
	@Column(length=30)
    private String dis;
    private int pincode;
	
	public Address() {
		super();
	}
	public Address(String state, String dis, int pincode) {
		super();
		this.state = state;
		this.dis = dis;
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDis() {
		return dis;
	}
	public void setDis(String dis) {
		this.dis = dis;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", dis=" + dis + ", pincode=" + pincode + "]";
	}
    
}
