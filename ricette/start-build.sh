#!/bin/bash

echo Building RICETTE Microservices

gradle clean

gradle build

docker build -t cmik/ricette:1.2.2 .

docker push cmik/ricette:1.2.2
