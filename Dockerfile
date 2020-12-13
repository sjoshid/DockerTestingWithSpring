FROM tomcat:8.5.61-jdk8-openjdk

# copy war to container
COPY out/artifacts/DockerTesting/DockerTesting.war webapps

CMD ["catalina.sh", "run"]