#!/bin/sh
mvn clean package && docker build -t com.axonactive.traning.football_project/footballtournament .
docker rm -f footballtournament || true && docker run -d -p 8080:8080 -p 4848:4848 --name footballtournament com.axonactive.traning.football_project/footballtournament 
