package com.zee.zee5app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.exception.InvalidIdLengthException;
import com.zee.zee5app.exception.InvalidNameException;

@Service
public interface MovieService {

	public String addMovie(Movie movie);
	public String updateMovie(String id, Movie movie);
	public Optional<Movie> getMovieById(String id) throws IdNotFoundException;
	public Optional<List<Movie>> getAllMovies() throws InvalidIdLengthException, InvalidNameException;
	public String deleteMovieById(String id) throws IdNotFoundException;
	
}