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
