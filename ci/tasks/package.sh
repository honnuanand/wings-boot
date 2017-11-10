#!/bin/bash

set -e -u -x

cd source-code/
echo `pwd`
./mvnw package

mv target/*.jar ../app-jar
ls ../app-jar
