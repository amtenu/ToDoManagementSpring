# Todo Management App

This is a simple Spring Boot todo management application that allows users to manage their tasks.

## Prerequisites

Before running this application, ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Maven
- Docker

## Installation

1. Clone this repository:

2. Navigate to the project directory: 
3. Build the project using Maven:


## Running the Application

1. Start MySQL using Docker:
2. docker run --detach --env MYSQL_ROOT_PASSWORD=1234
   --env MYSQL_USER=todos-user
   --env MYSQL_PASSWORD=1234
   --env  MYSQL_DATABASE=todos
   --name mysql --publish 3306:3306
   mysql:8-oracle
## Running the Application

1.Run the application (java -jar target/todo-management-app.jar)

##Data structure


## Configuration

The application uses MySQL as its database backend. You can modify the database connection properties in the `src/main/resources/application.properties` file if needed.

## Usage

Once the application is running, you can access it at http://localhost:8080. Here are some sample endpoints:

- `/todos`: Get all todos
- `/todos/{id}`: Get a todo by ID
- `/todos/add`: Add a new todo
- `/todos/update/{id}`: Update an existing todo
- `/todos/delete/{id}`: Delete a todo by ID

To log into the application, use the following credentials:
- **Username:** user1
- **Password:** 1234

## Data Structure

The application uses the following data model to manage todo items:

- **Id:** An auto-generated unique identifier for each todo item.
- **Username:** The username associated with the todo item.
- **Description:** A description of the todo item, with a minimum length of 10 characters.
- **Target Date:** The target date for completing the todo item.
- **Done:** A boolean value indicating whether the todo item is completed or not.

The corresponding MySQL database table schema for storing todo items is as follows:

```sql
CREATE TABLE IF NOT EXISTS todos (
 id INT AUTO_INCREMENT PRIMARY KEY,
 username VARCHAR(255) NOT NULL,
 description TEXT NOT NULL,
 target_date DATE,
 done BOOLEAN NOT NULL DEFAULT FALSE
);






