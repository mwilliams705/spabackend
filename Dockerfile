FROM openjdk:17-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
# This is not a bug; for some reason you must have the dot and space before ${HOME} var
ARG JAR_FILE=.${HOME}/target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]