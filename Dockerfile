FROM amazoncorretto:8-alpine-jdk

COPY target/portfolioBackend-0.0.1-SNAPSHOT.jar portfolio.jar

#ADD target/* portfolio.jar

ENTRYPOINT ["java","-jar", "/portfolio.jar"]