#!/bin/bash

echo Starting all microservices

#START API-GATEWAY
cd deploy/api-gateway
./start-container.sh

#START KAFKA
cd ../kafka
./start-container.sh

#START POSTGRES CONNESSIONI
cd ../postgres-connessioni
./start-container.sh

#START POSTGRES RICETTE
cd ../postgres-ricette
./start-container.sh

#START POSTGRES RICETTE-SEGUITE
cd ../postgres-ricette-seguite
./start-container.sh

#START CONNESSIONI
cd ../connessioni
./start-container.sh

#START RICETTE
cd ../ricette
./start-container.sh

#START RICETTE-SEGUITE
cd ../ricette-seguite
./start-container.sh