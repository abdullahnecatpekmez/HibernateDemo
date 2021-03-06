package org.hibernate.map.dto;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetailsCascade {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
    private int userId;
	
	private String userName;
	
    @OneToMany(cascade=CascadeType.ALL)
	private Collection<VehicleCascade> vehicle=new ArrayList<VehicleCascade>();
	
	public Collection<VehicleCascade> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<VehicleCascade> vehicle) {
		this.vehicle = vehicle;
	}
	public int getUserId() {
			return userId;
		}
	public void setUserId(int userId) {
		this.userId = userId;
	}
    public String getUserName() {
	  return userName;
    }
    public void setUserName(String userName) {
	  this.userName = userName;
    }
}
