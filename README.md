# Student Management System

## Project Overview

This project is a **Spring Boot** based **Student Management System** that allows for basic CRUD operations (Create, Read, Update, Delete) on student data. It includes the ability to manage students’ information like name, email, age, and gender, and it implements a RESTful API for interaction.

## Features

- **CRUD Operations**: Provides endpoints to add, retrieve, update, and delete students from a database.
- **Filtering**: Supports filtering students by age range.
- **Gender Conversion**: Uses a custom converter for persisting gender information in the database.
- **Specifications**: Implements dynamic query building using Spring JPA Specifications for flexible student data retrieval.

## Technologies Used

- **Java 17**
- **Spring Boot 3.3.3**
- **Spring Data JPA**
- **MySQL** for data persistence
- **Lombok** for cleaner code
- **Maven** for project build and dependencies

## REST API Endpoints

- `GET /student/{id}`: Retrieve a student by ID.
- `GET /student`: Retrieve students filtered by age range.
- `POST /student`: Add a new student.
- `PUT /student/{id}`: Update a student's information.
- `DELETE /student/{id}`: Delete a student by ID.

## Database Entities

### Student

Represents the student entity stored in the database, which includes:
- **ID** (Primary Key)
- **Name**
- **Email**
- **Age**
- **Gender** (Handled via a custom converter)

## Example Queries

- **Find students by age range**: Allows filtering students within a specified age range.
- **Dynamic querying**: Supports flexible queries with criteria like name, email, or age using Spring JPA Specifications.

## How to Run

1. Clone the repository.
2. Configure the **MySQL** database in `application.properties`.
3. Run the project using Maven:
   ```bash
   mvn spring-boot:run
