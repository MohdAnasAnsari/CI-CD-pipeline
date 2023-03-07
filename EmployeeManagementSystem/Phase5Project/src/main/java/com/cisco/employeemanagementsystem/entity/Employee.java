package com.cisco.employeemanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_info")
public class Employee {
	
	@Id
	@Column(name = "empid")
	private long empId;
	
	@Column(name = "empname")
	private String empName;
	
	@Column(name = "empsal")
	private float empSal;
	
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(Long  empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public Employee(Long  empId, String empName, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

}

