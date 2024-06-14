
FROM openjdk:11-jre-slim

WORKDIR /app

COPY build/libs /app/libs

CMD ["java", "-jar", "/app/libs/tu-app.jar"]