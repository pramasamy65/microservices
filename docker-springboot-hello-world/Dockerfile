FROM openjdk:8-jdk-alpine
COPY target/docker-springboot-hello-world-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=test", "/app.jar"]

# docker build -t blog/sbdemo:latest .
# docker run -d --name demo-default -p 9080:8090 -p 8091:8091 blog/sbdemo:latest

#https://codefresh.io/docker-tutorial/java_docker_pipeline/