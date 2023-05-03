FROM amazoncorretto:17-alpine-jdk

EXPOSE 8080

COPY target/portfolioBackend-0.0.1-SNAPSHOT.jar portfolio.jar

#ADD target/* portfolio.jar

ENTRYPOINT ["java","-jar", "/portfolio.jar"]