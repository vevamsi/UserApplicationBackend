FROM openjdk:11
ADD target/UserLogin-0.0.1-SNAPSHOT.jar UserLogin-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","UserLogin-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081