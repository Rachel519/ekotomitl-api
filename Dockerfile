./gradlew clean biuld
FROM azul/zulu-openjdk:17-latest
VOLUME /tmp
COPY build/libs/*.jar app.jar /app/
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080