#!/bin/bash

echo Deleting Postgres Ricette

kubectl delete service/postgres-ricette-seguite-service -n asw-project
kubectl delete deployment postgres-ricette-seguite-deployment -n asw-project
kubectl delete pv postgres-ricette-seguite-pv-volume