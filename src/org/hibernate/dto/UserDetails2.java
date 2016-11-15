package org.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails2 {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
   private int userId;
	
	@ElementCollection
	@JoinTable(name="USER_ADRESS",joinColumns=@JoinColumn(name="USER_ID"))
	@GenericGenerator(name="hilo-gen",strategy="hilo")
	@CollectionId(columns={@Column(name="ADRESS_ID")},generator="hilo-gen",type=@Type(type="long"))
	private Collection<Adress> listOfAdress=new ArrayList<Adress>();
	private String userName;
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
