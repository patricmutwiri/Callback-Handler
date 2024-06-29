# Use the official Maven image to build the application
FROM maven:3.8.1-openjdk-22 AS build
MAINTAINER patric.xyz
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests

# Use a minimal base image to run the application
FROM openjdk:22-jdk-alpine
ARG JAR_FILE=/app/target/*.jar
COPY ${JAR_FILE} callback-handler.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/callback-handler.jar"]