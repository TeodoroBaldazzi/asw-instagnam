#!/bin/bash

echo Building Microservices

gradle clean

gradle build

docker build -t cmik/ricette-seguite .

docker push cmik/ricette-seguite
