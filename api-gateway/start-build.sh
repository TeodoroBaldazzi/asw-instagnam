#!/bin/bash

echo Building Microservices

gradle clean

gradle build

docker build -t cmik/api-gateway:1.1.2 .

docker push cmik/api-gateway:1.1.2
