FROM openjdk:17-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
RUN ls -a && cd home && ls -a
# This is not a bug; for some reason you must have the dot and space before ${HOME} var in GITHUB ACTIONS
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]