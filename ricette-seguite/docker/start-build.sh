#!/bin/bash

echo Building Microservices

gradle clean

gradle build

docker build -t cmik/ricette-seguite:v1 .

docker push cmik/ricette-seguite:v1
