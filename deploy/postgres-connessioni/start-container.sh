#!/bin/bash

echo Starting Postgres Microservice in a Docker Container

kubectl apply -f postgres-connessioni-configmap.yaml
kubectl apply -f postgres-storage-connessioni.yaml
kubectl apply -f deployment-postgres-connessioni.yaml
kubectl apply -f service-postgres-connessioni.yaml