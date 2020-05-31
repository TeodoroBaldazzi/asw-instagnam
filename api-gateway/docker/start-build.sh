#!/bin/bash

echo Building Microservices

gradle clean

gradle build

docker build -t cmik/api-gateway:v1 .

docker push cmik/api-gateway:v1
