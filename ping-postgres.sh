#! /bin/bash -e

# check if postgres is reachable

docker run \
   --name postgresterm --rm \
   postgres  \
   sh -c 'exec psql -h postgres -U postgres --version'
