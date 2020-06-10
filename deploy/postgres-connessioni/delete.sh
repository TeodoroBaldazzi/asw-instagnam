#!/bin/bash

echo Deleting Postgres Connessioni

kubectl delete service/postgres-connessioni-service -n asw-project
kubectl delete deployment postgres-connessioni-deployment -n asw-project
kubectl delete pv postgres-connessioni-pv-volume