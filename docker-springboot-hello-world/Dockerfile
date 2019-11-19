FROM openjdk:8-jdk-alpine
COPY target/docker-springboot-hello-world-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=test", "/app.jar"]

# https://github.com/pramasamy65/tech-notes/blob/master/docker/2.Docker%20SpringBoot-Hello-world%20Example.md
# Refer the link for Docker execution
