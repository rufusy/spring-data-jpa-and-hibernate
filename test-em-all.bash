#!/bin/bash
#
# Sample usage:
#
# ./test-em-all.bash start
# ./test-em-all.bash start stop

: ${HOST=localhost}
: ${PORT=8080}

set -e

echo "Start Tests: $(date)"

echo "HOST={$HOST}"
echo "PORT={$PORT}"

if [[ $@ = *"start"* ]]
then
  echo "Restarting the test environment..."
  echo "$ docker compose down --remove-orphans"
  docker compose down --remove-orphans
  echo "$ docker compose up -d"
  docker compose up -d
fi

if [[ $@ == *"stop"* ]]
then
  echo "We are done, stopping the test environment..."
  echo "$ docker compose down"
  docker compose down
fi

echo "End, all tests OK: $(date)"