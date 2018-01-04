# Devices Tracking System - Configuration Server
The Configuration Server acts as an external repository containing configuration 
files for microservices composing the application.

## Project status
[![Build Status](https://travis-ci.org/device-tracking-system/configuration-server.svg?branch=develop)](https://travis-ci.org/device-tracking-system/configuration-server)
[![codebeat badge](https://codebeat.co/badges/f6639797-6e98-4736-a158-1318ff329ac3)](https://codebeat.co/projects/github-com-device-tracking-system-configuration-server-master)
    
## Prerequisites
You need to have the following tools installed and configured:
  - Java SE 1.8+
  - Maven 3.0+

## Installation and Commissioning
In order to run the configuration server, follow these steps:
  1. Clone the latest production version of this repository from the `master` branch.
  2. Navigate to the cloned repository and install all dependencies by typing:
```
mvn install
``` 
  3. Run the built `*.jar` file passing the location of configuration files by typing:
```
java -jar target/configuration-server-1.0-SNAPSHOT.jar --spring.config.location=classpath:pl/edu/agh/iet/dts/config/
```

## Building the Docker image
When the `*.jar` file is successfully built, a Docker image for the production environment may be created by applying
following steps:
  1. Enter the root directory of this repository.
  2. Build the Docker image by typing:
```
docker build . -t configuration-server
```
  3. In order to run the image, type:
```
docker run -p 8888:8888 -p 44331:44321 -p 44333:44323 -t configuration-server
```
Please note that this docker container uses the Performance Co-Pilot (PCP) tool to gather data for system monitoring
metrics. These values are accessed via the `44331` and `44333` ports. In order to visualize performance of this
microservice, please enter the `[CONTAINER IP ADDRESS]:44333` value in the `Hostname` field placed in the Netflix Vector
dashboard.
