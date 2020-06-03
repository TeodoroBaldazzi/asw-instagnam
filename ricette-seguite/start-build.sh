#!/bin/bash

echo Building Microservices

gradle clean

gradle build

docker build -t cmik/ricette-seguite:1.1.2 .

docker push cmik/ricette-seguite:1.1.2
