package com.grocerymanagement.iteamcatelog.Order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.DefaultValue;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

@Entity
@Table(name="User_Information")
@Data
public class User {

	@Id
	private Long UserId;
	
	@Column
	private String UserName;
	
	@Column
	@DefaultValue("India")
	private String Country;
	
    @Column
    @DefaultValue("Maharashtra")
    private String State;
	
	@Column
	private String AddressLine;
	
	@Column
	private Integer PinCode;

	
	public Long getUserId() {
		return UserId;
	}


	public void setUserId(Long userId) {
		UserId = userId;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public String getAddressLine() {
		return AddressLine;
	}


	public void setAddressLine(String addressLine) {
		AddressLine = addressLine;
	}


	public Integer getPinCode() {
		return PinCode;
	}


	public void setPinCode(Integer pinCode) {
		PinCode = pinCode;
	}


	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", Country=" + Country + ", State=" + State
				+ ", AddressLine=" + AddressLine + ", PinCode=" + PinCode + "]";
	}
	
}