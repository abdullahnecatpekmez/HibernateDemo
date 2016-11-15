package org.hibernate.map.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle1ToM {

	@Id @GeneratedValue
	private int vecleId;
	@ManyToOne
	private UserDetails1ToM userDetails;
	private String vehicleName;
	
	public UserDetails1ToM getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails1ToM userDetails) {
		this.userDetails = userDetails;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getVecleId() {
		return vecleId;
	}
	public void setVecleId(int vecleId) {
		this.vecleId = vecleId;
	}
	

}
