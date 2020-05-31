#!/bin/bash

echo Starting Api-gateway in a Docker Container

kubectl apply -f Deployment-api-gateway.yaml

kubectl apply -f Service-api-gateway.yaml
 
sleep 10s
 
kubectl port-forward --namespace=asw-project $(kubectl get pods --namespace=asw-project -l=app=api-gateway | grep api-gateway | awk '{print $1}') 8080:8080
 

