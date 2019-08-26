FROM java:8
EXPOSE 8080
ARG JAR_FILE
ADD target/${JAR_FILE} /kubernetes-hello-world.jar
ENTRYPOINT ["java", "-jar","/kubernetes-hello-world.jar"]