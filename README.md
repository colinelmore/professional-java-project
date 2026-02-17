# Professional Java Project

## Overview
The Professional Java Project is designed to provide a structured approach to managing entities through a console-based application. It implements a layered architecture consisting of a business layer, service layer, and a frontend interface, allowing users to perform CRUD (Create, Read, Update, Delete) operations on entities.

## Project Structure
The project is organized into the following main directories:

- **src/main/java/com/professional**: Contains the main application code.
  - **business**: Contains the `BusinessLogic` class for handling CRUD operations.
  - **service**: Contains the `ServiceLayer` class that exposes business logic methods.
  - **frontend**: Contains the `ConsoleApp` class for user interaction.
  - **models**: Contains the `Entity` class representing the data structure.

- **src/main/resources**: Contains configuration files.
  - **application.properties**: Configuration for database connection and application settings.

- **src/test/java/com/professional**: Contains test classes for the application.
  - **business**: Contains tests for the `BusinessLogic` class.
  - **service**: Contains tests for the `ServiceLayer` class.
  - **frontend**: Contains tests for the `ConsoleApp` class.

- **database**: Contains SQL scripts for database setup and test data.
  - **create_tables.sql**: SQL script to create necessary tables.
  - **insert_test_data.sql**: SQL script to insert test data into the tables.
  - **schema.sql**: Schema definition for the database.

- **pom.xml**: Maven configuration file for managing project dependencies and build settings.

## Features
- **CRUD Operations**: The application supports Create, Read, Update, and Delete operations for entities.
- **Layered Architecture**: Separates concerns into business logic, service layer, and frontend for better maintainability.
- **Console Interface**: Provides a simple console-based interface for user interaction.

## Setup Instructions
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd professional-java-project
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Configure the database connection in `src/main/resources/application.properties`.
5. Run the application:
   ```
   mvn exec:java -Dexec.mainClass="com.professional.frontend.ConsoleApp"
   ```

## Usage
- Use the console interface to create, read, update, and delete entities.
- Modify the SQL scripts in the `database` directory to customize the database schema and test data as needed.

## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue for any enhancements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.