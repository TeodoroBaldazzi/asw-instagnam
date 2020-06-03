#!/bin/bash

echo Building Microservices

gradle clean

gradle build

docker build -t cmik/connessioni:1.1.2 .

docker push cmik/connessioni:1.1.2
