FROM openjdk:11
EXPOSE 8081
ADD target/banking-details-service.jar banking-details-service.jar

ENTRYPOINT ["java","-jar","/banking-details-service.jar"]