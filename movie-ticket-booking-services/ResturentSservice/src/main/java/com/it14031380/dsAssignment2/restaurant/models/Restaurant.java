/*
 * Student ID	: IT14031380
 * Student Name : Perera P.D.S
 * Distributed Systems
 * Assignment 2 � Web Services
 * */
package com.it14031380.dsAssignment2.restaurant.models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Restaurant {
	private String type;
	private List<FoodItem> foodList = new ArrayList<FoodItem>();
		
	public List<FoodItem> getFoodList() {
		return foodList;
	}
	
	public void setFoodList(List<FoodItem> foodList) {
		this.foodList = foodList;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
}
