package com.casestudy.user;

import java.time.LocalDate;
import java.time.LocalTime;

public class StationStops {

	private String stationName;
	
	public StationStops() {
		
	}
	public StationStops(String stationName) {
		super();
		this.stationName = stationName;
		
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	
	


}