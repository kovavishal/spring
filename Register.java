package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Register1")
@EntityListeners(AuditingEntityListener.class) // this is added so that that teh created and updated by fields will be
												// populated automatically by JPA
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Register implements Serializable 
{
	@Id
	//@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Override
	public String toString() {
		return "Register [id=" + id + ",loginName=" +loginName  + ", password=" + password + ", emailId=" + emailId + ",contactNumber="+contactNumber +",gender="+gender+",createdAt=" + createdAt + ", updatedAt="+ updatedAt + "]";
	}
	
	@NotNull
	private String  loginName;
	
	@NotNull
	private String  password;
	
	@NotNull
	private String  emailId;
	
	@NotNull
	private String  contactNumber;
	
	@NotNull
	private String  gender;
	
	@Column(nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
	public String getloginName() {
		return loginName;
	}

	public void setloginName(String loginName) {
		this.loginName = loginName;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getemailId() {
		return emailId;
	}

	public void setemailId(String emailId) {
		this.emailId = emailId;
	}

	public String getcontactNumber() {
		return contactNumber;
	}

	public void setcontactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getgender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	

}
