FROM adoptopenjdk/openjdk11:latest
MAINTAINER Mallika
VOLUME /tmp1
COPY ./target/*.jar app.jar
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar"]