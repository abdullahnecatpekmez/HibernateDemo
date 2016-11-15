package org.hibernate.inheritance.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Porsche")
public class FourWheelerSingleTable extends Vehicle {
	private String SteeringWheel;
	
	public String getSteeringWheel() {
		return SteeringWheel;
	}
	
	public void setSteeringWheel(String steeringWheel) {
		SteeringWheel = steeringWheel;
	}
}
