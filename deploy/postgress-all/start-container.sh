#!/bin/bash

echo Starting Postgres  in a Docker Container

kubectl apply -f postgres-connessioni-configmap.yaml

kubectl apply -f postgres-storage-connessioni.yaml

kubectl apply -f deployment-postgres-connessioni.yaml

kubectl apply -f service-postgres-connessioni.yaml

kubectl apply -f postgres-ricette-configmap.yaml

kubectl apply -f postgres-storage-ricette.yaml

kubectl apply -f deployment-postgres-ricette.yaml

kubectl apply -f service-postgres-ricette.yaml

kubectl apply -f postgres-ricette-seguite-configmap.yaml

kubectl apply -f postgres-storage-ricette-seguite.yaml

kubectl apply -f deployment-postgres-ricette-seguite.yaml

kubectl apply -f service-postgres-ricette-seguite.yaml
