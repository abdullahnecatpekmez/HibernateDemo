package org.hibernate.map.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class VehicleMToM {

	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	@ManyToMany(mappedBy="vehicle")
	private Collection<UserDetailsMToM> userDetailsList=new ArrayList<UserDetailsMToM>();
	private String vehicleName;
	
	public Collection<UserDetailsMToM> getUserDetailsList() {
		return userDetailsList;
	}
	public void setUserDetailsList(Collection<UserDetailsMToM> userDetailsList) {
		this.userDetailsList = userDetailsList;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	

}
