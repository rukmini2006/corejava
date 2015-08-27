package com.rukmini.hibernateproject.User;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DBUSER")
public class DBUSER  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userName;
	private String createdBy;
	private Date createdDate;
	
	public DBUSER() {
		
	}
	public DBUSER(int userId, String userName, String createdBy,Date createdDate)
	{
		this.userId = userId;
		this.userName = userName;
		this.createdBy =createdBy;
		 this.createdDate = createdDate;
	}
	
	@Id
   @Column(name="USER_ID",unique=true, nullable=false,precision=5,scale=0)
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column(name="USERNAME",nullable=false,length = 20)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="CREATED_BY",nullable=false,length = 20)
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE",nullable=false,length = 7)
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n userId ="+ userId+"\n username ="+ userName +"\n createdBy ="+ createdBy+"\n createdDate ="+ createdDate;
	}
	
	
	
}
