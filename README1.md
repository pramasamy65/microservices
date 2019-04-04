## MicroServices
	
### Annotations Used
* @SpringBootApplication
* @RestController
* @RequestMapping
* @Bean
* @Autowired
	
### Program & Concepts

* Step 1 : Create MovieCatalogResource, MovieService, RatingService MicroServices
* Step 2 : 

* Rest Template **Refer MovieCatalogResource.java**
	* Will be used to call other microservices
	* Syntax
		```
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(),
				Movie.class);
		```

		
* Reactive Programming
	* Async way of coding
	
* Web Client
	
	

