package com.emd;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
	@Column(name="eid")
   private int id;
	@Column(length=30)
	private String ename;
	@Embedded
	Address ad;
	public Employee(int id, String ename, Address ad) {
		super();
		this.id = id;
		this.ename = ename;
		this.ad = ad;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", ad=" + ad + "]";
	}
	
}
