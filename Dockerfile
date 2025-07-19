FROM eclipse-temurin:21-jdk-alpine
COPY target/devops-1.0.1.jar app.jar
ENTRYPOINT ["java", "-Dspring.config.additional-location=file:/config/", "-jar", "app.jar"]