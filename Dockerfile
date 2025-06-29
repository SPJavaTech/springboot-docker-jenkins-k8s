FROM eclipse-temurin:21-jdk-alpine
COPY target/devops-1.0.1.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]