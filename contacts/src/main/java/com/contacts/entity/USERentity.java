package com.contacts.entity;

import java.io.Serializable;

public class USERentity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer ID;
	private String NAME;
	private String NUM;
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getNUM() {
		return NUM;
	}
	public void setNUM(String nUM) {
		NUM = nUM;
	}
	
	
}
