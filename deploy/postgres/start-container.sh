#!/bin/bash

echo Starting Postgres Microservice in a Docker Container

kubectl apply -f postgres-configmap.yaml
kubectl apply -f postgres-storage.yaml
kubectl apply -f deployment-postgres.yaml
kubectl apply -f service-postgres.yaml