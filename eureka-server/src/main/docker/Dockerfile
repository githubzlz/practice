FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD eureka-server-0.0.1-SNAPSHOT.jar eureka.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka.jar"]