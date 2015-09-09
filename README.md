An excursion into microservices

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

'GET /sentence?next-big-thing=Facebook,%20but%20with%20Bitcoin'

### eureka-server ###

Service registration. You can view the monitor panel at

`localhost:8761`