FROM maven:3-amazoncorretto-17
ADD target/users-login-api-docker.jar users-login-api-docker.jar
ENTRYPOINT ["java", "-jar","users-login-api-docker.jar"]
EXPOSE 8080
