#!/bin/bash

echo Building Microservices

gradle clean

gradle build

docker build -t cmik/api-gateway .

docker push cmik/api-gateway
