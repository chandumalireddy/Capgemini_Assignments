package com.example.demo;

import java.util.Date;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("orderss")
public class Order {

	@Id
	public int _id;
	public float total;
	public Date date;
	public NCustomer customer;
	public LineItem lineItem;
	
	// constructor
	public Order(int _id, float total, Date date, NCustomer customer) {
		this._id = _id;
		this.total = total;
		this.date = date;
		this.customer = customer;
	}

	// getters and setters
	public int get_id() {
		return _id;}
	public void set_id(int _id) {
		this._id = _id;}
	public float getTotal() {
		return total;}
	public void setTotal(float total) {
		this.total = total;}
	public Date getDate() {
		return date;}
	public void setDate(Date date) {
		this.date = date;}
	public NCustomer getCustomer() {
		return customer;}
	public void setCustomer(NCustomer customer) {
		this.customer = customer;}
	
	public LineItem getLineItem() {
		return lineItem;}
	public void setLineItem(LineItem lineItem) {
		this.lineItem = lineItem;}
}