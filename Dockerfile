FROM eclipse-temurin:21-jdk AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build /target/takenote-0.0.1-SNAPSHOT.jar takenote.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","takenote.jar"]