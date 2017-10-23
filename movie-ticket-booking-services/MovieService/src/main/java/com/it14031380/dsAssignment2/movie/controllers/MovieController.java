/*
 * Student ID	: IT14031380
 * Student Name : Perera P.D.S
 * Distributed Systems
 * Assignment 2 � Web Services
 * */
package com.it14031380.dsAssignment2.movie.controllers;

import java.util.HashMap;
import java.util.Map;

import com.it14031380.dsAssignment2.movie.models.Movie;


public class MovieController {
	static MovieController movieController = null;
    Map<Integer, Movie> movieList = new HashMap<Integer, Movie>();
    
    private MovieController() {
        //Add some dummy data to movieList
    	Movie movie1 = new Movie();
    	movie1.setId("1");
    	movie1.setName("Transformers: The Last Knight");
    	movie1.setDescription("A washed up monster chaser convinces the U.S. Government to fund a trip to an unexplored island in the South Pacific. Under the guise of geological research, the team travels to \"Skull Island\". Upon arrival, the group discover that their mission may be complicated by the wildlife which inhabits the island. The beautiful vistas and deadly creatures create a visually stunning experience that is sure to keep your attention.");
    	movie1.setDirector("Jordan Vogt-Roberts");
    	movie1.setGenre("Action / Adventure / Fantasy / Sci-Fi");
    	movie1.setImageUrl("https://yts.ag/assets/images/movies/kong_skull_island_2017/medium-cover.jpg");
    	movie1.setYear("2017");
        movieList.put(1, movie1);  
        
        Movie movie2 = new Movie();
        movie2.setId("2");
        movie2.setName("Moontrap: Target Earth");
        movie2.setDescription("A long forgotten ancient spacecraft discovered on Earth. Investigations carried out by Scout transport her to the moon whereupon she meets the impressive machines preserving the wisdom of that long lost civilization.");
        movie2.setDirector("Robert Dyke");
        movie2.setGenre("Action / Adventure / Sci-Fi");
        movie2.setImageUrl("https://yts.ag/assets/images/movies/moontrap_target_earth_2017/medium-cover.jpg");
        movie2.setYear("2017");
        movieList.put(2, movie2);
                
        Movie movie3 = new Movie();
        movie3.setId("3");
        movie3.setName("Arrival");
        movie3.setDescription("When mysterious spacecraft touch down across the globe, an elite team - led by expert linguist Louise Banks - is brought together to investigate. As mankind teeters on the verge of global war, Banks and the team race against time for answers - and to find them, she will take a chance that could threaten her life, and quite possibly humanity.");
        movie3.setDirector("Denis Villeneuve");
        movie3.setGenre("Drama / Mystery / Sci-Fi / Thriller");
        movie3.setImageUrl("https://yts.ag/assets/images/movies/arrival_2016/medium-cover.jpg");
        movie3.setYear("2016");
        movieList.put(3, movie3);
        
        Movie movie4 = new Movie();
        movie4.setId("4");
        movie4.setName("Zootopia");
        movie4.setDescription("From the largest elephant to the smallest shrew, the city of Zootopia is a mammal metropolis where various animals live and thrive. When Judy Hopps becomes the first rabbit to join the police force, she quickly learns how tough it is to enforce the law. Determined to prove herself, Judy jumps at the opportunity to solve a mysterious case. Unfortunately, that means working with Nick Wilde, a wily fox who makes her job even harder.");
        movie4.setDirector("Byron Howard");
        movie4.setGenre("Action / Adventure / Animation / Comedy / Crime / Family / Mystery");
        movie4.setImageUrl("https://yts.ag/assets/images/movies/zootopia_2016/medium-cover.jpg");
        movie4.setYear("2016");
        movieList.put(4, movie4);
        
        
        Movie movie5 = new Movie();
        movie5.setId("5");
        movie5.setName("The Legend of Tarzan");
        movie5.setDescription("Following his parents' death in Africa, John Clayton has been be raised by an ape, was known by the name Tarzan, but eventually left Africa and for his parents' home in England, along with the woman he fell in love with and married, Jane Porter. He is asked by Belgian King Leopold to go to Africa to see what he has done there to help the country. Initially, he refuses. But an American, George Washington Williams, wants him to accept so he can accompany him. He says that Leopold might be committing all sorts of atrocities to achieve his goal, like slavery.");
        movie5.setDirector("David Yates");
        movie5.setGenre("Action / Adventure / Drama / Romance");
        movie5.setImageUrl("https://yts.ag/assets/images/movies/the_legend_of_tarzan_2016/medium-cover.jpg");
        movie5.setYear("2016");
       movieList.put(5, movie5);
        
        Movie movie6 = new Movie();
        movie6.setId("6");
        movie6.setName("Kung Fu Panda 3");
        movie6.setDescription("When Po's long-lost panda father suddenly reappears, the reunited duo travels to a secret panda paradise to meet scores of hilarious new panda characters. But when the supernatural villain Kai begins to sweep across China defeating all the kung fu masters, Po must do the impossible-learn to train a village full of his fun-loving, clumsy brethren to become the ultimate band of Kung Fu Pandas.");
        movie6.setDirector("Jennifer Yuh");
        movie6.setGenre("Action / Adventure / Animation / Comedy / Family / Fantasy");
        movie6.setImageUrl("https://yts.ag/assets/images/movies/kung_fu_panda_3_2016/medium-cover.jpg");
        movie6.setYear("2016");
        movieList.put(6, movie6);
        
    }
  //Create and return single object
    public static MovieController getMovieController() {
        if (movieController != null) {
            return movieController;
        } else {
            movieController = new MovieController();
            return movieController;
        }
    }
 // Returns all Movie objects
    public Map<Integer, Movie> getAllMovies() {
        return movieList;
    }
   
    
}
