package org.hibernate.dto;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails3 {
	 @Id@GeneratedValue(strategy=GenerationType.SEQUENCE)
	 private int LoginName;
	 
	 @Embedded
	 private Adress officeAdress;
	 
	 @Embedded
	 @AttributeOverrides({
	 @AttributeOverride(name="street"  ,column=@Column(name="HOME_STREET")),
	 @AttributeOverride(name="city"    ,column=@Column(name="HOME_CITY")),
	 @AttributeOverride(name="state"   ,column=@Column(name="HOME_STATE")),
	 @AttributeOverride(name="pincode" ,column=@Column(name="HOME_PINCODE"))
	 })
	 private String userName;
	 
	private Adress homeAdress;
	 
	   public int getLoginName() {
			return LoginName;
		}
		public void setLoginName(int loginName) {
			LoginName = loginName;
		}
		public Adress getHomeAdress() {
			return homeAdress;
		}
		public void setHomeAdress(Adress homeAdress) {
			this.homeAdress = homeAdress;
		}
		public Adress getOfficeAdress() {
			return officeAdress;
		}
		public void setOfficeAdress(Adress officeAdress) {
			this.officeAdress = officeAdress;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
}
