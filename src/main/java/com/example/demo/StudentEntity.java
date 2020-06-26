package com.example.demo;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer StudId;
	private String StudName;
	private String StudDept;

//	@Override
//	public String toString() {
//		return "StudentImplementation {" +
//				"StudId=" + StudId + 
//				",StudName='"+ StudName + '\'' +
//				",StudDept='"+ StudDept + '\'' +
//							'}'; 
//					
//	}
//	   
	
	public StudentEntity() {
	}


	public Integer getStudId() {
		return StudId;
	}


	public void setStudId(Integer studId) {
		StudId = studId;
	}


	public String getStudName() {
		return StudName;
	}


	public void setStudName(String studName) {
		StudName = studName;
	}


	public String getStudDept() {
		return StudDept;
	}


	public void setStudDept(String studDept) {
		StudDept = studDept;
	}

	
	
	
}
