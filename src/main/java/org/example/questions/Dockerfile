FROM openjdk:lrs-jdk-21

WORKDIR /app

COPY target/my-app.jar my-app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","my-app.jar"]
