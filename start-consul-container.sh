#!/bin/bash

echo Starting Consul in a Docker Container

kubectl create -f nameSpace.yaml

kubectl apply -f Deployment-consul.yaml

kubectl apply -f Service-consul.yaml

kubectl port-forward --namespace=asw-project $(kubectl get pods --namespace=asw-project -l=app=consul | awk '{print $1}' | grep consul) 8500:8500
