# Use a Maven image with Java 17 for building
FROM maven:3.8.2-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
COPY --from=build /target/Development-1.0-SNAPSHOT.jar Development.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Management.jar"]