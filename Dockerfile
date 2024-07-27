FROM openjdk:17


WORKDIR /app1
EXPOSE 8080
COPY ./target/spring-docker.jar /app1
CMD [ "java","-jar","spring-docker.jar" ]