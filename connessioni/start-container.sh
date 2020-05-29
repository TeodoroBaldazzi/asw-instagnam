#!/bin/bash

echo Starting Connsessioni Microservice in a Docker Container

kubectl apply -f Deployment-connessioni.yaml

kubectl apply -f Service-connessioni.yaml
