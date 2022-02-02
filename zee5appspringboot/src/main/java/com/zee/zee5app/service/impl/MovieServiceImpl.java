package com.zee.zee5app.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.exception.InvalidIdLengthException;
import com.zee.zee5app.exception.InvalidNameException;
import com.zee.zee5app.repository.MovieRepository;
import com.zee.zee5app.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository movieService;
	
	public MovieServiceImpl() throws IOException {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String addMovie(Movie movie) {
		// TODO Auto-generated method stub
		Movie movie1 =movieService.save(movie);
		if(movie1==null)
			return "fail";
		return "success";
	}

	@Override
	public String updateMovie(String id, Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Movie> getMovieById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return movieService.findById(id);
	}

	@Override
	public Optional<List<Movie>> getAllMovies() throws InvalidIdLengthException, InvalidNameException {
		// TODO Auto-generated method stub
		return Optional.ofNullable(movieService.findAll());
	}

	@Override
	public String deleteMovieById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		try {
			Optional<Movie> optional = this.getMovieById(id);
			if(optional.isEmpty()) {
				throw new IdNotFoundException("record not found");
			}
			else {
				movieService.deleteById(id);
			return "success";}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IdNotFoundException(e.getMessage());
		}
	}
	
//	@Override
//	public String addMovie(Movie movie) {
//		// TODO Auto-generated method stub
//		
//		
//		return movieService.addMovie(movie);
//	}
//
//	@Override
//	public String updateMovie(String id, Movie movie) {
//		// TODO Auto-generated method stub
//		return movieService.updateMovie(id, movie);
//	}
//
//	@Override
//	public Optional<Movie> getMovieById(String id) throws IdNotFound {
//		// TODO Auto-generated method stub
//		return movieService.getMovieById(id);
//	}
//
//	@Override
//	public Optional<List<Movie>> getAllMovies() throws InvalidIdLengthException, InvalidNameException {
//		// TODO Auto-generated method stub
//		return movieService.getAllMovies();
//	}
//
//	@Override
//	public String deleteMovieById(String id) throws IdNotFound {
//		// TODO Auto-generated method stub
//		return movieService.deleteMovieById(id);
//	}

}