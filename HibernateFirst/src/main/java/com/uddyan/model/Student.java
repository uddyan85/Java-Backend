package com.uddyan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentTable")
public class Student {

//	ye sab columns hai.
	
	@Id
	@Column(name="SID")
	private Integer sid; //primary key
	
	@Column(name="SNAME") //aise bhi column name de sakte hain
	private String sName;
	
	@Column(name="SCITY")
	private String sCity;
	
	
	public Student() {
		System.out.print("Zero param. constructor for Hibernate.");
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", sCity=" + sCity + "]";
	}
	
	
}
