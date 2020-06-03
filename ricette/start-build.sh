#!/bin/bash

echo Building Microservices

gradle clean

gradle build

docker build -t cmik/ricette: 1.1.2 .

docker push cmik/ricette: 1.1.2
