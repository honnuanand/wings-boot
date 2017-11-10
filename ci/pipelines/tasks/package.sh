#!/bin/bash

set -e -u -x
echo "Ready to compile"
cd source-code/
./mvnw package
