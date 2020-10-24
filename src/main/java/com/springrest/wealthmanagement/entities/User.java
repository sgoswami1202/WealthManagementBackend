package com.springrest.wealthmanagement.entities;

import java.util.Date;

//import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;

	private String fName;

	@NotBlank(message ="First Name is required")
	@NotNull
	@Size(min=4,max = 15, message = "Please use 4 to 15 characters")
	private String lName;
	@NotBlank(message = "Last Name is required")
	@NotNull
	private long age;
	@NotBlank(message = "Age cannot be blank")
	@NotNull
	private long income;
	@NotBlank(message = "Income cannot be blank")
	@NotNull
	private long expenses;
	@NotBlank(message = "expenses cannot be blank")
	@NotNull
	private long savings;
	@NotBlank(message = "Savings cannot be blank")
	@NotNull
	
	private Date created_At;
	private Date updated_At;
	
		
	public User() {
		super();
	}

		
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}



	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public long getAge() {
		return age;
	}



	public void setAge(long age) {
		this.age = age;
	}



	public long getIncome() {
		return income;
	}



	public void setIncome(long income) {
		this.income = income;
	}



	public long getExpenses() {
		return expenses;
	}



	public void setExpenses(long expenses) {
		this.expenses = expenses;
	}



	public long getSavings() {
		return savings;
	}



	public void setSavings(long savings) {
		this.savings = savings;
	}



	public Date getCreated_At() {
		return created_At;
	}



	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}



	public Date getUpdated_At() {
		return updated_At;
	}



	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}



	@PrePersist
	protected void onCreate() {
		this.created_At = new Date();
		}
	
	@PreUpdate
	protected void onUpdate() {
		this.updated_At = new Date();
		}
	
	
}
