package org.hibernate.dto;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
    private int userId;
	
	private String userName;
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="USER_ADRESS",joinColumns=@JoinColumn(name="USER_ID"))
	private Collection<Adress> listOfAdress=new ArrayList<Adress>();
	
    @ManyToMany
	private Collection<Vehicle> vehicle=new ArrayList<Vehicle>();
	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	public int getUserId() {
			return userId;
		}
	public void setUserId(int userId) {
		this.userId = userId;
	}
    public Collection<Adress> getListOfAdress() {
	  return listOfAdress;
    }
    public void setListOfAdress(Collection<Adress> listOfAdress) {
	  this.listOfAdress = listOfAdress;
    }
    public void setListOfAdress(Set<Adress> listOfAdress) {
	  this.listOfAdress = listOfAdress;
    }
    public String getUserName() {
	  return userName;
    }
    public void setUserName(String userName) {
	  this.userName = userName;
    }
}
