#!/bin/bash

echo Starting Connsessioni Microservice in a Docker Container

kubectl apply -f deployment-connessioni.yaml

kubectl apply -f service-connessioni.yaml
