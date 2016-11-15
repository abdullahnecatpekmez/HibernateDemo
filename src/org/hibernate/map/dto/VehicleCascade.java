package org.hibernate.map.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class VehicleCascade {

	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	private UserDetailsCascade user;
	private String vehicleName;
	
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
