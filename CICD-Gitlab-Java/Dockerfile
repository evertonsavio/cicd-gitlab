FROM maven:3.6.3-jdk-11-slim AS MAVEN_BUILD
ARG SPRING_ACTIVE_PROFILE
MAINTAINER Savio
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn clean install -Dspring.profiles.active=$SPRING_ACTIVE_PROFILE && mvn package -B -e -Dspring.profiles.active=$SPRING_ACTIVE_PROFILE
FROM openjdk:11-slim
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/*.jar /app/appdemo.jar
ENTRYPOINT ["java", "-jar", "appdemo.jar"]