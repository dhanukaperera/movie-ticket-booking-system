/*
 * Student ID	: IT14031380
 * Student Name : Perera P.D.S
 * Distributed Systems
 * Assignment 2 � Web Services
 * */
package com.it14031380.dsAssignment2.movie.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.it14031380.dsAssignment2.movie.controllers.MovieController;
import com.it14031380.dsAssignment2.movie.controllers.TheaterController;
import com.it14031380.dsAssignment2.movie.models.Movie;
import com.it14031380.dsAssignment2.movie.models.Theater;

@Path("/movieservice")
public class MovieService {
	
	// Returns all tasks in JSON format
    @GET
    @Path("/GetAllTheaters")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Theater> getAllTheaters() {
    	TheaterController taskHandler = TheaterController.getTheaterController();
        // Cannot convert HashMap to JSON
        // All objects are casted to ArrayList
        return new ArrayList<Theater>(taskHandler.getAllTheaters().values());
    }
    
    // Returns theater by id in JSON format
    @GET
    @Path("/GetTheaterById/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public Theater getById(@PathParam("id") int id) {
    	TheaterController taskHandler = TheaterController.getTheaterController();
        return taskHandler.getTheaterById(id);
    }
    
    // Returns all movies in JSON format
    @GET
    @Path("/GetAllMovies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movie> getAllTaks2() {
        MovieController movieController = MovieController.getMovieController();
        // Cannot convert HashMap to JSON
        // All objects are casted to ArrayList
        return new ArrayList<Movie>(movieController.getAllMovies().values());
    }

}