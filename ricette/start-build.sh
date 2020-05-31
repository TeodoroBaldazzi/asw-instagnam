#!/bin/bash

echo Building Microservices

gradle clean

gradle build

docker build -t cmik/ricette:v1 .

docker push cmik/ricette:v1
