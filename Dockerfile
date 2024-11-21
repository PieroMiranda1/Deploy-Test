FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/si729pc2u20181g752-0.0.1-SNAPSHOT.jar /si729pc2u20181g752.jar
EXPOSE 8080
CMD ["java", "-jar", "/si729pc2u20181g752.jar"]
