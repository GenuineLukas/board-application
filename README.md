# Simple Board Application

## Project Details

| Component   | Details             |
|-------------|---------------------|
| **Language** | Java 11             |
| **Framework**| Spring Boot 2.7.X   |
| **DBMS**     | MySQL 8             |
| **DB Library** | JPA              |

## Overview

The Simple Board Application is a web-based platform designed to demonstrate a basic CRUD (Create, Read, Update, Delete) operation using a layered architecture in Spring Boot. This project serves as a learning tool for understanding Spring Boot with JPA and MySQL.

## Table of Contents
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Configuration](#configuration)
- [Application Architecture](#application-architecture)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Project Structure](#project-structure)

## Technologies Used

### Languages and Frameworks

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)

### Database

![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-007396?style=for-the-badge&logo=hibernate&logoColor=white)

### Build Tools

![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)

## Installation

### Prerequisites

Before you begin, ensure you have the following installed on your local machine:

- Java 11
- Maven or Gradle
- MySQL 8

### Steps

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/your-username/simple-board.git
    cd simple-board
    ```

2. **Configure the Database:**

    Create a database named `simple_board` in your MySQL server.

    ```sql
    CREATE DATABASE simple_board;
    ```

3. **Refactor Application File Extension to YAML:**

    Refactor the application file under the `resources` directory to have the `.yaml` extension.

4. **Add Configuration Code:**

    Add the following configuration in your `application.yaml` file:

    ```yaml
    spring:
      jpa:
        show-sql: true
        properties:
          format_sql: true
          dialect: org.hibernate.dialect.MYSQL8Dialect
        hibernate:
          ddl-auto: validate
      datasource:
        url: jdbc:mysql://localhost:3306/simple_board?useSSL=false&useUnicode=true&allowPublicKeyRetrieval=true
        driver-class-name: com.mysql.cj.jdbc.Driver
        username: root
        password: root1234!!
    ```

5. **Install Dependencies:**

    For Maven:

    ```bash
    mvn clean install
    ```

    For Gradle:

    ```bash
    ./gradlew build
    ```

6. **Run the Application:**

    For Maven:

    ```bash
    mvn spring-boot:run
    ```

    For Gradle:

    ```bash
    ./gradlew bootRun
    ```

## Configuration

Ensure your `application.yaml` is correctly configured to connect to your MySQL database. Adjust the username and password as per your local MySQL configuration.

```yaml
spring:
  jpa:
    show-sql: true
    properties:
      format_sql: true
      dialect: org.hibernate.dialect.MYSQL8Dialect
    hibernate:
      ddl-auto: validate
  datasource:
    url: jdbc:mysql://localhost:3306/simple_board?useSSL=false&useUnicode=true&allowPublicKeyRetrieval=true
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: root
    password: root1234!!
