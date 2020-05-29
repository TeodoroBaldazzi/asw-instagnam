#!/bin/bash

echo Building Microservices

gradle clean

gradle build

docker build -t cmik/connessioni .

docker push cmik/connessioni
