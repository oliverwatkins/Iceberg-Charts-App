package com.frontangle.chartapp;

import java.io.Serializable;

/**
 * 
 * 
 * @author oliver
 */
public class ChartFile implements Serializable{
	
	public ChartFile(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	String name;
	String location;

}
