# Web Services with Spring Boot and JPA/Hibernate

REST API project developed with **Spring Boot**, using **Spring Data JPA + Hibernate** for data persistence.  
The goal is to demonstrate the creation of RESTful services following **layered architecture best practices**.

---

## Technologies

- Java  
- Spring Boot  
- Spring Data JPA  
- Hibernate  
- Maven  
- Relational database (H2 / configurable)


---

## Project Structure

src/main/java
├── entities # JPA entities
├── repositories # JpaRepository interfaces
├── services # Business logic
├── resources # REST controllers
└── exceptions # Exception handling

## Features

- Full CRUD operations via REST API  
- ORM mapping with JPA/Hibernate  
- Clear separation of concerns (Controller, Service, Repository)  
- Custom exception handling  
- Test data initialization


## Endpoints (example)

| Method | Endpoint        | Description        |
|-------|-----------------|--------------------|
| GET   | `/users`        | Get all users      |
| GET   | `/users/{id}`   | Get user by ID     |
| POST  | `/users`        | Create a new user  |
| PUT   | `/users/{id}`   | Update a user      |
| DELETE| `/users/{id}`   | Delete a user      |

---

## How to Run

### Clone the repository

```bash
git clone https://github.com/brunowill-code/Web-services-with-Spring-Boot-and-JPA-Hibernate-
```
### Run the application
mvn spring-boot:run

The application will be available at:
```bash
http://localhost:8080
```

### Database Configuration
src/main/resources/application.properties

### Project Goal
Educational project to practice:
- REST API development with Spring Boot  
- Data persistence using JPA/Hibernate  
