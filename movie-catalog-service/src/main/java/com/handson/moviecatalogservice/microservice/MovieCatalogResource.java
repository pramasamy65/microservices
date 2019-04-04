package com.handson.moviecatalogservice.microservice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.handson.moviecatalogservice.model.CatalogItem;
import com.handson.moviecatalogservice.model.Movie;
import com.handson.moviecatalogservice.model.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

		List<Rating> ratingsList = Arrays.asList(new Rating("100", 7), new Rating("200", 10), new Rating("300", 10));

		return ratingsList.stream().map(rating -> {
			Movie movieDetails = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(),
					Movie.class);
			return new CatalogItem(movieDetails.getName(), "Desc : Fantastic Movie", rating.getRating());
		}).collect(Collectors.toList());

	}

}
