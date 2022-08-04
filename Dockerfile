FROM openjdk:17
EXPOSE 10000
ADD target/docker-jenkins-integration.jar docker-jenkins-integration.jar
ENTRYPOINT [ "java", "-jar" "docker-jenkins-integration.jar"  ]