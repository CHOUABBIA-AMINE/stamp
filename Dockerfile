FROM maven:3.8.5-openjdk-17 AS production
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=production /target/stamp-0.0.1-SNAPSHOT.jar stampAPI.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "stampAPI.jar" ]