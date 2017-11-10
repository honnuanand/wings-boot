#!/bin/bash

set -e -u -x

cd source-code/
./mvnw package

mv target/*.jar ../app-jar
mv manifest.yml ../app-jar
ls ../app-jar
