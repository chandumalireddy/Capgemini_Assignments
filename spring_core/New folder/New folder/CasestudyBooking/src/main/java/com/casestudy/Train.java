package com.casestudy;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;


@Document("train")
public class Train {
	
	
	private long trainNo;
	
	private String trainName;
	
	private String source;

	private String destination;
	
	private LocalDate date;
	private LocalTime arrivalTime;
	private LocalTime departureTime;

	
private List<reservationType> reservationVacancy;
private List<StationStops> stops;
	public Train(){
		
	}
	public Train(long trainNo,
			 String trainName,
			 String source,
			String destination,  LocalDate date, LocalTime arrivalTime, LocalTime departureTime,
			List<reservationType> reservationVacancy, List<StationStops> stops) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.reservationVacancy = reservationVacancy;
		this.stops = stops;
	}
	public long getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(long trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	public List<reservationType> getReservationVacancy() {
		return reservationVacancy;
	}
	public void setReservationVacancy(List<reservationType> reservationVacancy) {
		this.reservationVacancy = reservationVacancy;
	}
	public List<StationStops> getStops() {
		return stops;
	}
	public void setStops(List<StationStops> stops) {
		this.stops = stops;
	}
	public LocalTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	

}