FROM amazoncorretto:17.0.6-alpine-jdk

COPY target/portfolioBackend-0.0.1-SNAPSHOT.jar portfolio.jar

ENTRYPOINT ["java","-jar", "/portfolio.jar"]