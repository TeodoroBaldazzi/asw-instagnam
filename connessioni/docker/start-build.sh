#!/bin/bash

echo Building Microservices

gradle clean

gradle build

docker build -t cmik/connessioni:v1 .

docker push cmik/connessioni:v1
