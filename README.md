MySQL, Hibernate, Redis, Docker

We have a MySQL relational database with a schema. The task is to move all frequently requested data into Redis (in memory storage of key-value type).

Steps:
* Set up Docker
* Run MySQL server as a docker container
* Import database from a dump file
* Create a project in Idea, add maven dependencies
* Make a domain layer
* Write a method to get all data from MySQL
* Write a data transformation method
* Run Redis server as a docker container
