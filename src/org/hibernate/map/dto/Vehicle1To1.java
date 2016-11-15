package org.hibernate.map.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Vehicle1To1 {
	@Id @GeneratedValue
	private int vecvehicleId;
	private String vehicleName;
	
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getVecvehicleId() {
		return vecvehicleId;
	}
	public void setVecvehicleId(int vecvehicleId) {
		this.vecvehicleId = vecvehicleId;
	}
	
	
}
