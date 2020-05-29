#!/bin/bash

echo Starting Api-gateway in a Docker Container

kubectl apply -f Deployment-api-gateway.yaml

kubectl apply -f Service-api-gateway.yaml
                 
kubectl port-forward --namespace=asw-project $(kubectl get pods --namespace=asw-project -l=app=api-gateway | awk '{print $1}' | grep api-gateway) 8080:8080
