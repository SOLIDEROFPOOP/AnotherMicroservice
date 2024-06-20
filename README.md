# Another microservice study project 

## Description
This is a project to learn and advance my skills in microservice architecture


## Features
There is api gateway,
Eureka discovery server,
Eureka client server


## Architecture
This project follows microservice architecture with the following services (i am not great at coming up with names):
1) eureka-server: its a discovery server
2) api-gateway: its an api gateway with load balancing and stuff
3) eureka-client: its a client server that can be launched multiple instances to show that load balancing is working
4) people-service: i wanted inter service connection by rest so i added it has h2 database with initial records you can add or see them using eureka-client they are connected
