package com.eazybytes.eazyschool.model;

import lombok.Data;

@Data
public class Holiday {

    public Holiday(String day, String reason, Type type) {
		// TODO Auto-generated constructor stub
    	this.day= day;
    	this.reason= reason;
    	this.type=type;
	}



	private  String day ;
    private  String reason;
    private  Type type;
    
    
    

    public String getDay() {
		return day;
	}




	public void setDay(String day) {
		this.day = day;
	}




	public String getReason() {
		return reason;
	}




	public void setReason(String reason) {
		this.reason = reason;
	}




	public Type getType() {
		return type;
	}




	public void setType(Type type) {
		this.type = type;
	}




	public enum Type {
        FESTIVAL, FEDERAL
    }
}
