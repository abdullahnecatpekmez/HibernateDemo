package org.hibernate.map.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails1To1 {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
    private int userId;
	private String userName;
    @OneToOne
	private Vehicle1To1 vehicle;
	
    public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Vehicle1To1 getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle1To1 vehicle) {
		this.vehicle = vehicle;
	}
	public String getUserName() {
	  return userName;
    }
    public void setUserName(String userName) {
	  this.userName = userName;
    }
}
