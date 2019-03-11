package com.handson.movieinfoservice.microservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handson.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieService {

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie("100", "Avatar");
	}

}
