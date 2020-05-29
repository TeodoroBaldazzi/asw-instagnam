#!/bin/bash

echo Starting Ricette Microservice in a Docker Container

kubectl apply -f Deployment-ricette.yaml

kubectl apply -f Service-ricette.yaml
