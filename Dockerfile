FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY . /app/
RUN mvn clean package

FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /app/target/stamp-0.0.1-SNAPSHOT.jar stampAPI.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "stampAPI.jar" ]