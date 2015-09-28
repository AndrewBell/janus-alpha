This project aims to be a sandbox to demonstrate a microservice architecture using Spring Boot and Docker. The example is contrived, a sentence service depends on a noun service and adjective service to build a sentence describing what the "next big thing" will be.

## Requirements ##

Requirements (run as admin privileges):

git - https://git-scm.com/downloads

Java 8 - http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Maven - http://maven.apache.org/download.cgi

Docker - https://docs.docker.com/installation/ This can be installed locally, or remotely if you set an environment variable DOCKER_HOST=tcp://<remoteip>:2375

## Build ##

To test, build, and create docker images of all services:

`mvn clean install`

## Run ##

To launch your docker images

`cd docker`

`docker-compose up -d`

## Modules ##

### noun-service ###

REST access to /nouns

### adjective-service ###

REST access to /adjectives

### sentence-service ###

REST service that tells us about the next big thing!

`GET /sentence?next-big-thing=Facebook,%20but%20with%20Bitcoin`

### eureka-server ###

Service registration. You can view the monitor panel at

`localhost:8761`
