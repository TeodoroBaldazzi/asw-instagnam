#!/bin/bash

echo Building all services

#BUILD RICETTE
cd ricette
./start-build.sh

#BUILD RICETTE-SEGUITE
cd ../ricette-seguite
./start-build.sh

#BUILD CONNESSIONI
cd ../connessioni
./start-build.sh

#BUILD API-GATEWAY
cd ../api-gateway
./start-build.sh