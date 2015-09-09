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
