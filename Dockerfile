FROM openjdk:17
EXPOSE 8080
ADD  target/java-workflow-action-1.jar java-workflow-action-1.jar
ENTRYPOINT [ "java","-jar","/java-workflow-action-1.jar" ]