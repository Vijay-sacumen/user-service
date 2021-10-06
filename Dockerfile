FROM openjdk:8
ADD target/user-service-0.0.1.jar user-service-0.0.1.jar
EXPOSE 9002
ENTRYPOINT ["java","-jar","user-service-0.0.1.jar"]