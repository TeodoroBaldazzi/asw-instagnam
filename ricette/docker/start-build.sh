#!/bin/bash

echo Building Microservices

gradle clean

gradle build

docker build -t cmik/ricette .

docker push cmik/ricette
