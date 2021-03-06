FROM openjdk:8-jdk-alpine
RUN addgroup -S testgroup && adduser -S testuser -G testgroup
USER testuser:testgroup
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]