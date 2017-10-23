/*
 * Student ID	: IT14031380
 * Student Name : Perera P.D.S
 * Distributed Systems
 * Assignment 2 � Web Services
 * */
package com.it14031380.dsAssignment2.movie.models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Theater {
	private int id;
	private String name;
	private String location;
	private List<String> moviesList = new ArrayList<String>();
	private List<String> showTimes = new ArrayList<String>();
	private List<String> avaiableCategories = new ArrayList<String>();
	
	public List<String> getAvaiableCategories() {
		return avaiableCategories;
	}

	public void setAvaiableCategories(List<String> avaiableCategories) {
		this.avaiableCategories = avaiableCategories;
	}

	public List<String> getShowTimes() {
		return showTimes;
	}

	public void setShowTimes(List<String> showTimes) {
		this.showTimes = showTimes;
	}

	public int getId() {
		return id;
	}

	public List<String> getMoviesList() {
		return moviesList;
	}

	public void setMoviesList(List<String> moviesList) {
		this.moviesList = moviesList;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String description) {
		this.location = description;
	}
}
