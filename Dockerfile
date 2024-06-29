# Use the official Maven image to build the application
FROM alpine/java:22-jdk AS build
MAINTAINER patric.xyz
COPY . /app
WORKDIR /app
#RUN apk add maven
RUN mvn clean package -DskipTests

# Use a minimal base image to run the application
FROM alpine/java:22-jdk
COPY --from=build /app/target/*.jar /callback-handler.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/callback-handler.jar"]