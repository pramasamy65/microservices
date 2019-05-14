## MicroServices


## 1) Spring Cloud Config Server and Config Client Example

### Spring Cloud Config Server - Refer spring-cloud-config-server  and configurations project in MicroServices - https://github.com/pramasamy65/microservices/
	* Read the Configurations from GIT - https://github.com/pramasamy65/microservices/tree/master/configurations folder
	* @EnableConfigServer and port 8100
	* Mention the GIT URL and path configurations in the application.properties
	* http://localhost:8100/default/master
	* Reference
		* https://springbootdev.com/2018/07/14/microservices-introduction-to-spring-cloud-config-server-with-client-examples/
		* https://sivalabs.in/2017/08/spring-cloud-tutorials-introduction-to-spring-cloud-config-server/

### Spring Cloud Config Client - Refer welcome-service  and configurations project in MicroServices - https://github.com/pramasamy65/microservices/
	* Welcome-service is a Spring Cloud Config Client
	* port 8200
	* Use bootstrap.properties instead of application.proeprties.
	* So this Spring Cloud Config Client module will take care of starting the application by fetching the application properties from Config Server
	* bootstrap.properties also has config server URI **spring.cloud.config.uri=http://localhost:8100**
	* We can access the actuator endpoint http://localhost:8200/env to see all the configuration properties.

	
	* References
		* https://sivalabs.in/2017/08/spring-cloud-tutorials-introduction-to-spring-cloud-config-server/
	

## 2) 