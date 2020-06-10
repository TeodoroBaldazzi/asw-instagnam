#!/bin/bash

echo Deleting Postgres Ricette

kubectl delete service/postgres-ricette-service -n asw-project
kubectl delete deployment postgres-ricette-deployment -n asw-project
kubectl delete pv postgres-ricette-pv-volume