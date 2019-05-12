## MicroServices

### Initial GIT Settings
* git init
* git remote add origin https://github.com/pramasamy65/microservices.git
* git pull origin master
	
### MicroServices 1 - Movie Catalog Service -- Refer movie-catalog-service
* Input : User Id
* Output : Movie list with Details
	
* /catalog/{userId}

### MicroServices 2 - Movie Info Service -- Refer movie-info-service
* Input : Movie Id
* Output : Movie Details
	
* /movies/{movieId}

	
### MicroServices 3 - Movie Rating Service -- Refer movie-rating-service
* Input : Movie Id
* Output : Movie Id and Ratings
	
* /ratingsData/{movieId}
	

