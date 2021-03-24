FROM openjdk:11
LABEL source = "data-bureau-person-data"
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]