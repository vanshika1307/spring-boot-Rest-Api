# Spring Boot REST API Project

## Table of Contents
1. [Introduction](#introduction)
2. [Prerequisites](#prerequisites)
3. [Project Setup](#project-setup)
4. [Running the Project](#running-the-project)
5. [API Endpoints](#api-endpoints)
6. [Technologies Used](#technologies-used)
7. [Contributing](#contributing)
8. [License](#license)

## Introduction
This project is a Spring Boot application that demonstrates how to create a REST API with basic CRUD operations.

## Prerequisites
Ensure you have the following installed:
- Java Development Kit (JDK) 8 or later
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)
- Postman (for testing APIs)

## Project Setup

### 1. Create a Spring Boot Project
- Use [Spring Initializr](https://start.spring.io/) to generate a Spring Boot project with the following settings:
  - Project: Maven
  - Language: Java
  - Spring Boot: 2.7.1 (or latest)
  - Group: `com.example`
  - Artifact: `rest-api`
  - Dependencies: Spring Web, Spring Data JPA, PostgreSQL Driver

### 2. Set Up Your Database
- Create a database named `rest_api_db` in your PostgreSQL server.

### 3. Configure Application Properties
- Configure your database settings in `src/main/resources/application.properties`:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/rest_api_db
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

### 4. Create Entities, Repositories, Services, and Controllers
- Define your entities, repositories, services, and controllers to handle business logic and API requests.

## Running the Project
1. Open a terminal in your project directory.
2. Run the following command to build and start the application:

    ```bash
    mvn spring-boot:run
    ```

3. The application will start on `http://localhost:8080`.

## API Endpoints
- **GET /api/users**: Get all users
- **GET /api/users/{id}**: Get a user by ID
- **POST /api/users**: Create a new user
- **PUT /api/users/{id}**: Update a user by ID
- **DELETE /api/users/{id}**: Delete a user by ID

## Technologies Used
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Java

## Contributing
Contributions are welcome! Please open an issue or submit a pull request for any changes or improvements.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
