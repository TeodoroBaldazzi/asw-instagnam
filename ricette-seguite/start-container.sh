#!/bin/bash

echo Starting Ricette-seguite Microservice in a Docker Container

kubectl apply -f Deployment-ricette-seguite.yaml

kubectl apply -f Service-ricette-seguite.yaml
