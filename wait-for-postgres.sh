#! /bin/sh

until (./ping-postgres.sh -i > /dev/null)
do
 echo sleeping for postgres
 sleep 5
done