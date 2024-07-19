# Vault Integration
This project is a simple example of how to integrate HashiCorp Vault with a Spring Boot application.
## Goal
The goal of this project is to provide a simple way to integrate HashiCorp Vault with a Spring Boot application.
This project is a simple example of how to use Vault to store secrets and how to retrieve them in a Spring Boot application.

There is no right or wrong way of doing this, the goal is to show what your way of working is.

## TODO
- [x] Create a Spring Boot application using the password from the application.properties file
- [ ] Create a HashiCorp Vault server by adding it to the provided docker-compose file
- [ ] Put the database password in the Vault server
- [ ] Use the Vault secret in the Spring Boot application to connect to the database (you are free to choose how to authenticate to the Vault server,  but certificates are the preferred way)

## Wanted Result
The test for the application should pass.

Even though this only tests the startup of the context, it will show, that the connection to the database was successful.