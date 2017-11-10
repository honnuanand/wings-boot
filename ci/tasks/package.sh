#!/bin/bash

set -e -u -x

cd source-code/
echo `pwd`
./mvnw package

mv target/*.jar ../app-jar
cp manifest.yml ../app-jar
ls ../app-jar
