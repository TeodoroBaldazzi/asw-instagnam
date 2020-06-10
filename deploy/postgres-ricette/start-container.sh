#!/bin/bash

echo Starting Postgres Ricette Microservice in a Docker Container

kubectl apply -f postgres-ricette-configmap.yaml
kubectl apply -f postgres-storage-ricette.yaml
kubectl apply -f deployment-postgres-ricette.yaml
kubectl apply -f service-postgres-ricette.yaml