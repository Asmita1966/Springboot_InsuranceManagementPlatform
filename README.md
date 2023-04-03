 ### PROJECT NAME- Insurance Management Platform 

DESCRIPTION- It is an insurance management platform that allows users to manage insurance policies, clients, and claims using Spring Boot and Java.

Requirements- For building and running the application we need following tools:
* JDK 1.8
* Maven
* Spring.io.start
* MySQL workbench
* Postman

For creating the spring project we need following dependency:
* Spring data JPA
* Spring web
* MySQL driver

How to Run The Project:
1. Pull the project file
2. Open or import the file in Intellij Idea
3. Will ask to load mavens, load it.
4. Check if there is any posible updates, do it.
5. Start by running the application in debug mode.
6. If started succesfully, then msg like this "Started Insurance Management Platform" will show in the console
7. Open mysql workbench and postman alongside.
8. Run the project and start taking input in postman by providing necessary api request(Get, Post, Put, Delete)
9. I provided with one-to-one mapping so input will be nested format for all the three entities in postman.
10. Input can be taken once at a time because one-to-one mapping does not allow list interface.
11. If input shows correct then msg like "200 ok" will show in postman.
12. Then one can check the data in the database.

Project Structure by Layer:

![structure_IMP](https://user-images.githubusercontent.com/112343509/229557678-6a03d05f-c8de-4b02-ace5-fd67e597f899.png)

Features:
* Provided with lots of dependencies
* Reduces boilerplate code which saves a lot of time
* Provided with so many annotation for easy understand
* spring jpa provides more layers of abstraction



