# Use the official Maven image to build the application
FROM alpine:latest AS build

MAINTAINER patric.xyz

# Set environment variables
ENV MAVEN_VERSION=3.8.7
ENV JAVA_VERSION=22
ENV PATH=/usr/share/maven/bin:$PATH

# Install necessary tools and Maven
RUN apk update && apk add --no-cache bash curl tar

# Download and install Maven
RUN curl -fsSL https://archive.apache.org/dist/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
    | tar -xzC /usr/share \
    && ln -s /usr/share/apache-maven-${MAVEN_VERSION} /usr/share/maven

COPY . /app
WORKDIR /app

# Use a minimal base image to run the application
FROM amazoncorretto:22-alpine
COPY --from=build /app/target/*.jar /callback-handler.jar

# Expose the application port
EXPOSE 8080

# Pass environment variables at runtime
ENV DB_URL=${DB_URL}
ENV DB_USERNAME=${DB_USERNAME}
ENV DB_PASSWORD=${DB_PASSWORD}

# Run the application
ENTRYPOINT ["java", "-jar", "/callback-handler.jar"]