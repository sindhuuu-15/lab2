# Stage 1: Build using Maven and Java 17
FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the built JAR with Java 17
FROM openjdk:17
WORKDIR /app
COPY --from=builder /app/target/lab2-0.0.1-SNAPSHOT.jar app.jar
COPY ./json /app/json/   
ENTRYPOINT ["java", "-jar", "app.jar"]
