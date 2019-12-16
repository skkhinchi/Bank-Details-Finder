package com.fyle.assignment.model;

import javax.persistence.*;


@Entity
@Table(name="branches")
public class Branches {
	
	public  Branches() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue
	@Column(name="ifsc")
	private String ifsc;
	
	

	@Column(name="bank_id")
	private int bank_id;

//
//	@ManyToOne(mappedBy = "banks", cascade = CascadeType.ALL)
//	@JoinColumn
//	@Column(name="bid")
//	private int bid;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="address")
	private String address;
	
	

	@Column(name="city")
	private String city;
	
	@Column(name="district")
	private String district;
	
	@Column(name="state")
	private String state;

//
//	public int getBid() {
//		return bid;
//	}
//
//	public void setBid(int bid) {
//		this.bid = bid;
//	}

	
	
	
	
	
	
	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public int getBank_id() {
		return bank_id;
	}

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
		
		
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Branches [ifsc=" + ifsc + ", bank_id=" + bank_id + ", branch=" + branch + ", address=" + address
				+ ", city=" + city + ", district=" + district + ", state=" + state + "]";
	}

}
