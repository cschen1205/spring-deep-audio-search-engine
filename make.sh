#!/usr/bin/env bash

mvn -f pom.xml clean package -Plocal -U

cp /target/deep-audio-search-engine.jar deep-audio-search-engine.jar
