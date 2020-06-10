#!/bin/bash

echo Building RICETTE Microservices

gradle clean

gradle build

docker build -t cmik/ricette:1.1.3 .

docker push cmik/ricette:1.1.3
