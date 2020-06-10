#!/bin/bash

echo Starting Postgres Microservice in a Docker Container

kubectl apply -f postgres-ricette-seguite-configmap.yaml
kubectl apply -f postgres-storage-ricette-seguite.yaml
kubectl apply -f deployment-postgres-ricette-seguite.yaml
kubectl apply -f service-postgres-ricette-seguite.yaml